<template>
<div :style='{"width":"100%","padding":"20px 10%","margin":"30px auto","position":"relative"}'>
    <el-form
	  :style='{"border":"1px solid #333","width":"100%","padding":"40px","margin":"0 0 40px","position":"relative"}'
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="auto"
    >
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="农场主账号" prop="nongchangzhuzhanghao">
            <el-input v-model="ruleForm.nongchangzhuzhanghao" 
                placeholder="农场主账号" clearable :disabled=" false  ||ro.nongchangzhuzhanghao"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="农场主" prop="nongchangzhu">
            <el-input v-model="ruleForm.nongchangzhu" 
                placeholder="农场主" clearable :disabled=" false  ||ro.nongchangzhu"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="登记日期" prop="dengjiriqi">
              <el-date-picker
				  :disabled=" false  ||ro.dengjiriqi"
                  format="yyyy 年 MM 月 dd 日"
                  value-format="yyyy-MM-dd"
                  v-model="ruleForm.dengjiriqi" 
                  type="date"
                  placeholder="登记日期">
              </el-date-picker> 
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="标题" prop="biaoti">
            <el-input v-model="ruleForm.biaoti" 
                placeholder="标题" clearable :disabled=" false  ||ro.biaoti"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="票据" v-if="type!='cross' || (type=='cross' && !ro.piaoju)" prop="piaoju">
            <file-upload
            tip="点击上传票据"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.piaoju?ruleForm.piaoju:''"
            @change="piaojuUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' class="upload" v-else label="票据" prop="piaoju">
                <img v-if="ruleForm.piaoju.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.piaoju.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.piaoju.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="肥料支出" prop="feiliaozhichu">
			<el-input-number v-model="ruleForm.feiliaozhichu" placeholder="肥料支出" :readonly="ro.feiliaozhichu"></el-input-number>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="人工成本" prop="rengongchengben">
			<el-input-number v-model="ruleForm.rengongchengben" placeholder="人工成本" :readonly="ro.rengongchengben"></el-input-number>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="农药支出" prop="nongyaozhichu">
			<el-input-number v-model="ruleForm.nongyaozhichu" placeholder="农药支出" :readonly="ro.nongyaozhichu"></el-input-number>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="种子支出" prop="zhongzizhichu">
			<el-input-number v-model="ruleForm.zhongzizhichu" placeholder="种子支出" :readonly="ro.zhongzizhichu"></el-input-number>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="合计支出" prop="hejizhichu">
              <el-input v-model="hejizhichu" placeholder="合计支出" disabled></el-input>
          </el-form-item>

      <el-form-item :style='{"width":"100%","clear":"both","padding":"0 10px","margin":"0"}'>
        <el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"4px","background":"#00AA3A","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}'  type="primary" @click="onSubmit">提交</el-button>
        <el-button :style='{"border":"0px solid #00AA3A","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#fff","borderRadius":"4px","background":"#9e9e9e","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
</div>
</template>

<script>
  export default {
    data() {
	  let self = this
      return {
        id: '',
        baseUrl: '',
        ro:{
				nongchangzhuzhanghao : false,
				nongchangzhu : false,
				dengjiriqi : false,
				biaoti : false,
				piaoju : false,
				feiliaozhichu : false,
				rengongchengben : false,
				nongyaozhichu : false,
				zhongzizhichu : false,
				hejizhichu : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          nongchangzhuzhanghao: '',
          nongchangzhu: '',
          dengjiriqi: '',
          biaoti: '',
          piaoju: '',
          feiliaozhichu: '',
          rengongchengben: '',
          nongyaozhichu: '',
          zhongzizhichu: '',
          hejizhichu: '',
        },


        rules: {
          nongchangzhuzhanghao: [
          ],
          nongchangzhu: [
          ],
          dengjiriqi: [
          ],
          biaoti: [
            { required: true, message: '标题不能为空', trigger: 'blur' },
          ],
          piaoju: [
          ],
          feiliaozhichu: [
            { validator: this.$validate.isNumber, trigger: 'blur' },
          ],
          rengongchengben: [
            { validator: this.$validate.isNumber, trigger: 'blur' },
          ],
          nongyaozhichu: [
            { validator: this.$validate.isNumber, trigger: 'blur' },
          ],
          zhongzizhichu: [
            { validator: this.$validate.isNumber, trigger: 'blur' },
          ],
          hejizhichu: [
            { validator: this.$validate.isNumber, trigger: 'blur' },
          ],
        },
		centerType: false,
      };
    },
    computed: {
        hejizhichu: {
            get: function () {
                return 0+parseFloat(this.ruleForm.feiliaozhichu==""?0:this.ruleForm.feiliaozhichu)+parseFloat(this.ruleForm.rengongchengben==""?0:this.ruleForm.rengongchengben)+parseFloat(this.ruleForm.nongyaozhichu==""?0:this.ruleForm.nongyaozhichu)+parseFloat(this.ruleForm.zhongzizhichu==""?0:this.ruleForm.zhongzizhichu) || 0
            }
        },



    },
    components: {
    },
    created() {
		if(this.$route.query.centerType){
			this.centerType = true
		}
	  //this.bg();
      let type = this.$route.query.type ? this.$route.query.type : '';
      this.init(type);
      this.baseUrl = this.$config.baseUrl;
      this.ruleForm.dengjiriqi = this.getCurDate()
    },
    methods: {
      getMakeZero(s) {
          return s < 10 ? '0' + s : s;
      },
      // 下载
      download(file){
        window.open(`${file}`)
      },
      // 初始化
      init(type) {
        this.type = type;
        if(type=='cross'){
          var obj = JSON.parse(localStorage.getItem('crossObj'));
          for (var o in obj){
            if(o=='nongchangzhuzhanghao'){
              this.ruleForm.nongchangzhuzhanghao = obj[o];
              this.ro.nongchangzhuzhanghao = true;
              continue;
            }
            if(o=='nongchangzhu'){
              this.ruleForm.nongchangzhu = obj[o];
              this.ro.nongchangzhu = true;
              continue;
            }
            if(o=='dengjiriqi'){
              this.ruleForm.dengjiriqi = obj[o];
              this.ro.dengjiriqi = true;
              continue;
            }
            if(o=='biaoti'){
              this.ruleForm.biaoti = obj[o];
              this.ro.biaoti = true;
              continue;
            }
            if(o=='piaoju'){
              this.ruleForm.piaoju = obj[o].split(",")[0];
              this.ro.piaoju = true;
              continue;
            }
            if(o=='feiliaozhichu'){
              this.ruleForm.feiliaozhichu = obj[o];
              this.ro.feiliaozhichu = true;
              continue;
            }
            if(o=='rengongchengben'){
              this.ruleForm.rengongchengben = obj[o];
              this.ro.rengongchengben = true;
              continue;
            }
            if(o=='nongyaozhichu'){
              this.ruleForm.nongyaozhichu = obj[o];
              this.ro.nongyaozhichu = true;
              continue;
            }
            if(o=='zhongzizhichu'){
              this.ruleForm.zhongzizhichu = obj[o];
              this.ro.zhongzizhichu = true;
              continue;
            }
            if(o=='hejizhichu'){
              this.ruleForm.hejizhichu = obj[o];
              this.ro.hejizhichu = true;
              continue;
            }
          }
        }else if(type=='edit'){
			this.info()
		}
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
            if((json.nongchangzhuzhanghao!=''&&json.nongchangzhuzhanghao) || json.nongchangzhuzhanghao==0){
                this.ruleForm.nongchangzhuzhanghao = json.nongchangzhuzhanghao
            }
            if((json.nongchangzhu!=''&&json.nongchangzhu) || json.nongchangzhu==0){
                this.ruleForm.nongchangzhu = json.nongchangzhu
            }
          }
        });

		if (localStorage.getItem('raffleType') && localStorage.getItem('raffleType') != null) {
			localStorage.removeItem('raffleType')
			setTimeout(() => {
				this.onSubmit()
			}, 300)
		}
      },

    // 多级联动参数
      // 多级联动参数
      info() {
        this.$http.get(`nongchangfeiyong/detail/${this.$route.query.id}`, {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {

			this.ruleForm.hejizhichu = this.hejizhichu
			//更新跨表属性
			var crossuserid;
			var crossrefid;
			var crossoptnum;
			this.$refs["ruleForm"].validate(valid => {
				if(valid) {
					if(this.type=='cross'){
						var statusColumnName = localStorage.getItem('statusColumnName');
						var statusColumnValue = localStorage.getItem('statusColumnValue');
						if(statusColumnName && statusColumnName!='') {
							var obj = JSON.parse(localStorage.getItem('crossObj'));
							if(!statusColumnName.startsWith("[")) {
								for (var o in obj){
									if(o==statusColumnName){
										obj[o] = statusColumnValue;
									}
								}
								var table = localStorage.getItem('crossTable');
								this.$http.post(table+'/update', obj).then(res => {});
							} else {
								crossuserid=Number(localStorage.getItem('frontUserid'));
								crossrefid=obj['id'];
								crossoptnum=localStorage.getItem('statusColumnName');
								crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
							}
						}
					}
					if(crossrefid && crossuserid) {
						this.ruleForm.crossuserid=crossuserid;
						this.ruleForm.crossrefid=crossrefid;
						var params = {
							page: 1,
							limit: 10,
							crossuserid:crossuserid,
							crossrefid:crossrefid,
						}
						this.$http.get('nongchangfeiyong/list', {
							params: params
						}).then(res => {
							if(res.data.data.total>=crossoptnum) {
								this.$message({
									message: localStorage.getItem('tips'),
									type: 'error',
									duration: 1500,
								});
								return false;
							} else {
								// 跨表计算


								this.$http.post(`nongchangfeiyong/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
									if (res.data.code == 0) {
										this.$message({
											message: '操作成功',
											type: 'success',
											duration: 1500,
											onClose: () => {
												this.$router.go(-1);
											}
										});
									} else {
										this.$message({
											message: res.data.msg,
											type: 'error',
											duration: 1500
										});
									}
								});
							}
						});
					} else {


						this.$http.post(`nongchangfeiyong/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
							if (res.data.code == 0) {
								this.$message({
									message: '操作成功',
									type: 'success',
									duration: 1500,
									onClose: () => {
										this.$router.go(-1);
									}
								});
							} else {
								this.$message({
									message: res.data.msg,
									type: 'error',
									duration: 1500
								});
							}
						});
					}
				}
			});
		},
		// 获取uuid
		getUUID () {
			return new Date().getTime();
		},
		// 返回
		back() {
			this.$router.go(-1);
		},
      piaojuUploadChange(fileUrls) {
          this.ruleForm.piaoju = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");;
      },
    }
  };
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  padding: 0 10px 0 0;
	  color: #666;
	  font-weight: 500;
	  width: auto;
	  font-size: 14px;
	  line-height: 40px;
	  text-align: left;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: auto;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  border: 1px solid #eee;
	  border-radius: 0px;
	  padding: 0 12px;
	  color: #000;
	  width: auto;
	  font-size: 14px;
	  height: 40px;
	}
	.add-update-preview .el-input-number /deep/ .el-input__inner {
		text-align: left;
	  border: 1px solid #eee;
	  border-radius: 0px;
	  padding: 0 12px;
	  color: #000;
	  width: auto;
	  font-size: 14px;
	  height: 40px;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__decrease {
		display: none;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__increase {
		display: none;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  border: 1px solid #eee;
	  border-radius: 0px;
	  padding: 0 10px;
	  color: #000;
	  width: auto;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  border: 1px solid #eee;
	  border-radius: 0px;
	  padding: 0 10px 0 30px;
	  outline: none;
	  color: #000000;
	  width: auto;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  border: 1px solid #eee;
	  cursor: pointer;
	  border-radius: 0px;
	  color: #000000;
	  width: auto;
	  font-size: 32px;
	  line-height: 120px;
	  text-align: center;
	  min-width: 400px;
	  height: 120px;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  border: 1px solid #eee;
	  cursor: pointer;
	  border-radius: 0px;
	  color: #000000;
	  width: auto;
	  font-size: 32px;
	  line-height: 120px;
	  text-align: center;
	  min-width: 400px;
	  height: 120px;
	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  border: 1px solid #eee;
	  cursor: pointer;
	  border-radius: 0px;
	  color: #000000;
	  width: auto;
	  font-size: 32px;
	  line-height: 120px;
	  text-align: center;
	  min-width: 400px;
	  height: 120px;
	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  border: 1px solid #eee;
	  border-radius: 0px;
	  padding: 12px;
	  outline: none;
	  color: #000;
	  width: auto;
	  font-size: 14px;
	  min-width: 780px;
	  height: 120px;
	}
</style>
