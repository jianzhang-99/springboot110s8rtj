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
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="地块编号" prop="dikuaibianhao">
              <el-input v-model="ruleForm.dikuaibianhao" placeholder="地块编号" disabled></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="面积(㎡)" prop="mianji">
			<el-input-number v-model="ruleForm.mianji" placeholder="面积(㎡)" :readonly="ro.mianji"></el-input-number>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="土壤情况" prop="turangqingkuang">
            <el-input v-model="ruleForm.turangqingkuang" 
                placeholder="土壤情况" clearable :disabled=" false  ||ro.turangqingkuang"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="农场主账号" prop="nongchangzhuzhanghao">
            <el-input v-model="ruleForm.nongchangzhuzhanghao" 
                placeholder="农场主账号" clearable :disabled=" false  ||ro.nongchangzhuzhanghao"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="农场主" prop="nongchangzhu">
            <el-input v-model="ruleForm.nongchangzhu" 
                placeholder="农场主" clearable :disabled=" false  ||ro.nongchangzhu"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="土地图片" v-if="type!='cross' || (type=='cross' && !ro.tuditupian)" prop="tuditupian">
            <file-upload
            tip="点击上传土地图片"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.tuditupian?ruleForm.tuditupian:''"
            @change="tuditupianUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' class="upload" v-else label="土地图片" prop="tuditupian">
                <img v-if="ruleForm.tuditupian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.tuditupian.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.tuditupian.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="土地位置" prop="tudiweizhi">
            <el-input v-model="ruleForm.tudiweizhi" 
                placeholder="土地位置" clearable :disabled=" false  ||ro.tudiweizhi"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}'  label="土壤质量" prop="turangzhiliang">
            <el-select v-model="ruleForm.turangzhiliang" placeholder="请选择土壤质量" :disabled=" false  ||ro.turangzhiliang" >
              <el-option
                  v-for="(item,index) in turangzhiliangOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
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
				dikuaibianhao : false,
				mianji : false,
				turangqingkuang : false,
				nongchangzhuzhanghao : false,
				nongchangzhu : false,
				tuditupian : false,
				tudiweizhi : false,
				turangzhiliang : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          dikuaibianhao: this.getUUID(),
          mianji: '',
          turangqingkuang: '',
          nongchangzhuzhanghao: '',
          nongchangzhu: '',
          tuditupian: '',
          tudiweizhi: '',
          turangzhiliang: '',
        },
        turangzhiliangOptions: [],


        rules: {
          dikuaibianhao: [
          ],
          mianji: [
            { validator: this.$validate.isNumber, trigger: 'blur' },
          ],
          turangqingkuang: [
          ],
          nongchangzhuzhanghao: [
          ],
          nongchangzhu: [
          ],
          tuditupian: [
          ],
          tudiweizhi: [
          ],
          turangzhiliang: [
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
            if(o=='dikuaibianhao'){
              this.ruleForm.dikuaibianhao = obj[o];
              this.ro.dikuaibianhao = true;
              continue;
            }
            if(o=='mianji'){
              this.ruleForm.mianji = obj[o];
              this.ro.mianji = true;
              continue;
            }
            if(o=='turangqingkuang'){
              this.ruleForm.turangqingkuang = obj[o];
              this.ro.turangqingkuang = true;
              continue;
            }
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
            if(o=='tuditupian'){
              this.ruleForm.tuditupian = obj[o].split(",")[0];
              this.ro.tuditupian = true;
              continue;
            }
            if(o=='tudiweizhi'){
              this.ruleForm.tudiweizhi = obj[o];
              this.ro.tudiweizhi = true;
              continue;
            }
            if(o=='turangzhiliang'){
              this.ruleForm.turangzhiliang = obj[o];
              this.ro.turangzhiliang = true;
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
        this.turangzhiliangOptions = "高,中,低".split(',')

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
        this.$http.get(`tudi/detail/${this.$route.query.id}`, {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {

			if(this.ruleForm.dikuaibianhao){
				this.ruleForm.dikuaibianhao = String(this.ruleForm.dikuaibianhao)
			}
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
						this.$http.get('tudi/list', {
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


								this.$http.post(`tudi/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
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


						this.$http.post(`tudi/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
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
      tuditupianUploadChange(fileUrls) {
          this.ruleForm.tuditupian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");;
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
