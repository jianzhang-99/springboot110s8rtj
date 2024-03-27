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
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="用品编号" prop="yongpinbianhao">
            <el-input v-model="ruleForm.yongpinbianhao" 
                placeholder="用品编号" clearable :disabled=" false  ||ro.yongpinbianhao"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="用品名称" prop="yongpinmingcheng">
            <el-input v-model="ruleForm.yongpinmingcheng" 
                placeholder="用品名称" clearable :disabled=" false  ||ro.yongpinmingcheng"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="用品类型" prop="yongpinleixing">
            <el-input v-model="ruleForm.yongpinleixing" 
                placeholder="用品类型" clearable :disabled=" false  ||ro.yongpinleixing"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="供应商" prop="gongyingshang">
            <el-input v-model="ruleForm.gongyingshang" 
                placeholder="供应商" clearable :disabled=" false  ||ro.gongyingshang"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="用品图片" v-if="type!='cross' || (type=='cross' && !ro.yongpintupian)" prop="yongpintupian">
            <file-upload
            tip="点击上传用品图片"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.yongpintupian?ruleForm.yongpintupian:''"
            @change="yongpintupianUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' class="upload" v-else label="用品图片" prop="yongpintupian">
                <img v-if="ruleForm.yongpintupian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.yongpintupian.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.yongpintupian.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="农场主账号" prop="nongchangzhuzhanghao">
            <el-input v-model="ruleForm.nongchangzhuzhanghao" 
                placeholder="农场主账号" clearable :disabled=" false  ||ro.nongchangzhuzhanghao"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="采购数量" prop="kucun">
            <el-input v-model.number="ruleForm.kucun" 
                placeholder="采购数量" clearable :disabled=" false  ||ro.kucun"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="采购单价" prop="caigoudanjia">
			<el-input-number v-model="ruleForm.caigoudanjia" placeholder="采购单价" :readonly="ro.caigoudanjia"></el-input-number>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="合计" prop="heji">
              <el-input v-model="heji" placeholder="合计" disabled></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="采购时间" prop="caigoushijian">
              <el-date-picker
				  :disabled=" false  ||ro.caigoushijian"
                  value-format="yyyy-MM-dd HH:mm:ss"
                  v-model="ruleForm.caigoushijian" 
                  type="datetime"
                  placeholder="采购时间">
              </el-date-picker>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="采购备注" prop="caigoubeizhu">
            <el-input v-model="ruleForm.caigoubeizhu" 
                placeholder="采购备注" clearable :disabled=" false  ||ro.caigoubeizhu"></el-input>
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
				yongpinbianhao : false,
				yongpinmingcheng : false,
				yongpinleixing : false,
				gongyingshang : false,
				yongpintupian : false,
				nongchangzhuzhanghao : false,
				kucun : false,
				caigoudanjia : false,
				heji : false,
				caigoushijian : false,
				caigoubeizhu : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          yongpinbianhao: '',
          yongpinmingcheng: '',
          yongpinleixing: '',
          gongyingshang: '',
          yongpintupian: '',
          nongchangzhuzhanghao: '',
          kucun: '',
          caigoudanjia: '',
          heji: '',
          caigoushijian: '',
          caigoubeizhu: '',
        },


        rules: {
          yongpinbianhao: [
          ],
          yongpinmingcheng: [
          ],
          yongpinleixing: [
          ],
          gongyingshang: [
          ],
          yongpintupian: [
          ],
          nongchangzhuzhanghao: [
          ],
          kucun: [
            { required: true, message: '采购数量不能为空', trigger: 'blur' },
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
          caigoudanjia: [
            { validator: this.$validate.isNumber, trigger: 'blur' },
          ],
          heji: [
            { validator: this.$validate.isNumber, trigger: 'blur' },
          ],
          caigoushijian: [
          ],
          caigoubeizhu: [
          ],
        },
		centerType: false,
      };
    },
    computed: {


        heji:{
            get: function () {
                return 1*this.ruleForm.kucun*this.ruleForm.caigoudanjia
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
      this.ruleForm.caigoushijian = this.getCurDateTime()
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
            if(o=='yongpinbianhao'){
              this.ruleForm.yongpinbianhao = obj[o];
              this.ro.yongpinbianhao = true;
              continue;
            }
            if(o=='yongpinmingcheng'){
              this.ruleForm.yongpinmingcheng = obj[o];
              this.ro.yongpinmingcheng = true;
              continue;
            }
            if(o=='yongpinleixing'){
              this.ruleForm.yongpinleixing = obj[o];
              this.ro.yongpinleixing = true;
              continue;
            }
            if(o=='gongyingshang'){
              this.ruleForm.gongyingshang = obj[o];
              this.ro.gongyingshang = true;
              continue;
            }
            if(o=='yongpintupian'){
              this.ruleForm.yongpintupian = obj[o].split(",")[0];
              this.ro.yongpintupian = true;
              continue;
            }
            if(o=='nongchangzhuzhanghao'){
              this.ruleForm.nongchangzhuzhanghao = obj[o];
              this.ro.nongchangzhuzhanghao = true;
              continue;
            }
            if(o=='kucun'){
              this.ruleForm.kucun = obj[o];
              this.ro.kucun = true;
              continue;
            }
            if(o=='caigoudanjia'){
              this.ruleForm.caigoudanjia = obj[o];
              this.ro.caigoudanjia = true;
              continue;
            }
            if(o=='heji'){
              this.ruleForm.heji = obj[o];
              this.ro.heji = true;
              continue;
            }
            if(o=='caigoushijian'){
              this.ruleForm.caigoushijian = obj[o];
              this.ro.caigoushijian = true;
              continue;
            }
            if(o=='caigoubeizhu'){
              this.ruleForm.caigoubeizhu = obj[o];
              this.ro.caigoubeizhu = true;
              continue;
            }
          }
          this.ruleForm.kucun = 0
		  this.ro.kucun = false;
        }else if(type=='edit'){
			this.info()
		}
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
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
        this.$http.get(`yongpinruku/detail/${this.$route.query.id}`, {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {

			this.ruleForm.heji = this.heji
			if(!this.ruleForm.kucun){
				this.$message.error("采购数量不能为空");
				return
			}
			var obj = JSON.parse(localStorage.getItem('crossObj'));
			var table = localStorage.getItem('crossTable');
			obj.kucun = parseFloat(obj.kucun) + parseFloat(this.ruleForm.kucun)

			//this.$http.post(table+`/update`, obj).then(res => {});
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
						this.$http.get('yongpinruku/list', {
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
								var obj = JSON.parse(localStorage.getItem('crossObj'));
								var table = localStorage.getItem('crossTable');

								obj.kucun = parseFloat(obj.kucun) + parseFloat(this.ruleForm.kucun)

								this.$http.post(table+`/update`,obj).then(res => {});
								this.$http.post(`yongpinruku/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
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
						var obj = JSON.parse(localStorage.getItem('crossObj'));
						var table = localStorage.getItem('crossTable');

						obj.kucun = parseFloat(obj.kucun) + parseFloat(this.ruleForm.kucun)

						this.$http.post(table+`/update`,obj).then(res => {});
						this.$http.post(`yongpinruku/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
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
      yongpintupianUploadChange(fileUrls) {
          this.ruleForm.yongpintupian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");;
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
