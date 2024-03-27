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
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="种植户账号" prop="zhongzhihuzhanghao">
            <el-input v-model="ruleForm.zhongzhihuzhanghao" 
                placeholder="种植户账号" clearable :disabled=" false  ||ro.zhongzhihuzhanghao"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="种植户" prop="zhongzhihu">
            <el-input v-model="ruleForm.zhongzhihu" 
                placeholder="种植户" clearable :disabled=" false  ||ro.zhongzhihu"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="联系方式" prop="lianxifangshi">
            <el-input v-model="ruleForm.lianxifangshi" 
                placeholder="联系方式" clearable :disabled=" false  ||ro.lianxifangshi"></el-input>
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
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}'  label="支出类型" prop="zhichuleixing">
            <el-select v-model="ruleForm.zhichuleixing" placeholder="请选择支出类型" :disabled=" false  ||ro.zhichuleixing" >
              <el-option
                  v-for="(item,index) in zhichuleixingOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="支出费用" prop="zhichufeiyong">
			<el-input-number v-model="ruleForm.zhichufeiyong" placeholder="支出费用" :readonly="ro.zhichufeiyong"></el-input-number>
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
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="备注" prop="beizhu">
            <el-input v-model="ruleForm.beizhu" 
                placeholder="备注" clearable :disabled=" false  ||ro.beizhu"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="工作量" prop="gongzuoliang">
            <editor 
                :style='{"minHeight":"200px","padding":"0","margin":"0","borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}'
                v-model="ruleForm.gongzuoliang" 
                class="editor" 
                action="file/upload">
            </editor>
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
				zhongzhihuzhanghao : false,
				zhongzhihu : false,
				lianxifangshi : false,
				piaoju : false,
				zhichuleixing : false,
				zhichufeiyong : false,
				dengjiriqi : false,
				gongzuoliang : false,
				beizhu : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          zhongzhihuzhanghao: '',
          zhongzhihu: '',
          lianxifangshi: '',
          piaoju: '',
          zhichuleixing: '',
          zhichufeiyong: '',
          dengjiriqi: '',
          gongzuoliang: '',
          beizhu: '',
        },
        zhichuleixingOptions: [],


        rules: {
          zhongzhihuzhanghao: [
          ],
          zhongzhihu: [
          ],
          lianxifangshi: [
          ],
          piaoju: [
          ],
          zhichuleixing: [
            { required: true, message: '支出类型不能为空', trigger: 'blur' },
          ],
          zhichufeiyong: [
            { required: true, message: '支出费用不能为空', trigger: 'blur' },
            { validator: this.$validate.isNumber, trigger: 'blur' },
          ],
          dengjiriqi: [
          ],
          gongzuoliang: [
            { required: true, message: '工作量不能为空', trigger: 'blur' },
          ],
          beizhu: [
          ],
        },
		centerType: false,
      };
    },
    computed: {



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
            if(o=='zhongzhihuzhanghao'){
              this.ruleForm.zhongzhihuzhanghao = obj[o];
              this.ro.zhongzhihuzhanghao = true;
              continue;
            }
            if(o=='zhongzhihu'){
              this.ruleForm.zhongzhihu = obj[o];
              this.ro.zhongzhihu = true;
              continue;
            }
            if(o=='lianxifangshi'){
              this.ruleForm.lianxifangshi = obj[o];
              this.ro.lianxifangshi = true;
              continue;
            }
            if(o=='piaoju'){
              this.ruleForm.piaoju = obj[o].split(",")[0];
              this.ro.piaoju = true;
              continue;
            }
            if(o=='zhichuleixing'){
              this.ruleForm.zhichuleixing = obj[o];
              this.ro.zhichuleixing = true;
              continue;
            }
            if(o=='zhichufeiyong'){
              this.ruleForm.zhichufeiyong = obj[o];
              this.ro.zhichufeiyong = true;
              continue;
            }
            if(o=='dengjiriqi'){
              this.ruleForm.dengjiriqi = obj[o];
              this.ro.dengjiriqi = true;
              continue;
            }
            if(o=='gongzuoliang'){
              this.ruleForm.gongzuoliang = obj[o];
              this.ro.gongzuoliang = true;
              continue;
            }
            if(o=='beizhu'){
              this.ruleForm.beizhu = obj[o];
              this.ro.beizhu = true;
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
            if((json.zhongzhihuzhanghao!=''&&json.zhongzhihuzhanghao) || json.zhongzhihuzhanghao==0){
                this.ruleForm.zhongzhihuzhanghao = json.zhongzhihuzhanghao
            }
            if((json.zhongzhihu!=''&&json.zhongzhihu) || json.zhongzhihu==0){
                this.ruleForm.zhongzhihu = json.zhongzhihu
            }
            if((json.lianxifangshi!=''&&json.lianxifangshi) || json.lianxifangshi==0){
                this.ruleForm.lianxifangshi = json.lianxifangshi
            }
          }
        });
        this.zhichuleixingOptions = "种子,农药,肥料,其它".split(',')

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
        this.$http.get(`zhongzhifeiyong/detail/${this.$route.query.id}`, {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {

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
						this.$http.get('zhongzhifeiyong/list', {
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


								this.$http.post(`zhongzhifeiyong/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
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


						this.$http.post(`zhongzhifeiyong/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
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
