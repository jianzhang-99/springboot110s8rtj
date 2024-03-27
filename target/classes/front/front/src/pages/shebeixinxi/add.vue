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
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="设备编号" prop="shebeibianhao">
              <el-input v-model="ruleForm.shebeibianhao" placeholder="设备编号" disabled></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="设备名称" prop="shebeimingcheng">
            <el-input v-model="ruleForm.shebeimingcheng" 
                placeholder="设备名称" clearable :disabled=" false  ||ro.shebeimingcheng"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="型号" prop="xinghao">
            <el-input v-model="ruleForm.xinghao" 
                placeholder="型号" clearable :disabled=" false  ||ro.xinghao"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="设备分类" prop="shebeifenlei">
            <el-input v-model="ruleForm.shebeifenlei" 
                placeholder="设备分类" clearable :disabled=" false  ||ro.shebeifenlei"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="具体功能" prop="jutigongneng">
            <el-input v-model="ruleForm.jutigongneng" 
                placeholder="具体功能" clearable :disabled=" false  ||ro.jutigongneng"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="图片" v-if="type!='cross' || (type=='cross' && !ro.tupian)" prop="tupian">
            <file-upload
            tip="点击上传图片"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.tupian?ruleForm.tupian:''"
            @change="tupianUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' class="upload" v-else label="图片" prop="tupian">
                <img v-if="ruleForm.tupian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.tupian.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.tupian.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="设备位置" prop="shebeiweizhi">
            <el-input v-model="ruleForm.shebeiweizhi" 
                placeholder="设备位置" clearable :disabled=" false  ||ro.shebeiweizhi"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="保养周期" prop="baoyangzhouqi">
            <el-input v-model="ruleForm.baoyangzhouqi" 
                placeholder="保养周期" clearable :disabled=" false  ||ro.baoyangzhouqi"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="农场主账号" prop="nongchangzhuzhanghao">
            <el-input v-model="ruleForm.nongchangzhuzhanghao" 
                placeholder="农场主账号" clearable :disabled=" false  ||ro.nongchangzhuzhanghao"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="农场主" prop="nongchangzhu">
            <el-input v-model="ruleForm.nongchangzhu" 
                placeholder="农场主" clearable :disabled=" false  ||ro.nongchangzhu"></el-input>
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
				shebeibianhao : false,
				shebeimingcheng : false,
				xinghao : false,
				shebeifenlei : false,
				jutigongneng : false,
				tupian : false,
				shebeiweizhi : false,
				baoyangzhouqi : false,
				nongchangzhuzhanghao : false,
				nongchangzhu : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          shebeibianhao: this.getUUID(),
          shebeimingcheng: '',
          xinghao: '',
          shebeifenlei: '',
          jutigongneng: '',
          tupian: '',
          shebeiweizhi: '',
          baoyangzhouqi: '',
          nongchangzhuzhanghao: '',
          nongchangzhu: '',
        },


        rules: {
          shebeibianhao: [
          ],
          shebeimingcheng: [
            { required: true, message: '设备名称不能为空', trigger: 'blur' },
          ],
          xinghao: [
          ],
          shebeifenlei: [
            { required: true, message: '设备分类不能为空', trigger: 'blur' },
          ],
          jutigongneng: [
          ],
          tupian: [
          ],
          shebeiweizhi: [
          ],
          baoyangzhouqi: [
          ],
          nongchangzhuzhanghao: [
          ],
          nongchangzhu: [
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
            if(o=='shebeibianhao'){
              this.ruleForm.shebeibianhao = obj[o];
              this.ro.shebeibianhao = true;
              continue;
            }
            if(o=='shebeimingcheng'){
              this.ruleForm.shebeimingcheng = obj[o];
              this.ro.shebeimingcheng = true;
              continue;
            }
            if(o=='xinghao'){
              this.ruleForm.xinghao = obj[o];
              this.ro.xinghao = true;
              continue;
            }
            if(o=='shebeifenlei'){
              this.ruleForm.shebeifenlei = obj[o];
              this.ro.shebeifenlei = true;
              continue;
            }
            if(o=='jutigongneng'){
              this.ruleForm.jutigongneng = obj[o];
              this.ro.jutigongneng = true;
              continue;
            }
            if(o=='tupian'){
              this.ruleForm.tupian = obj[o].split(",")[0];
              this.ro.tupian = true;
              continue;
            }
            if(o=='shebeiweizhi'){
              this.ruleForm.shebeiweizhi = obj[o];
              this.ro.shebeiweizhi = true;
              continue;
            }
            if(o=='baoyangzhouqi'){
              this.ruleForm.baoyangzhouqi = obj[o];
              this.ro.baoyangzhouqi = true;
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
        this.$http.get(`shebeixinxi/detail/${this.$route.query.id}`, {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {

			if(this.ruleForm.shebeibianhao){
				this.ruleForm.shebeibianhao = String(this.ruleForm.shebeibianhao)
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
						this.$http.get('shebeixinxi/list', {
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


								this.$http.post(`shebeixinxi/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
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


						this.$http.post(`shebeixinxi/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
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
      tupianUploadChange(fileUrls) {
          this.ruleForm.tupian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");;
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
