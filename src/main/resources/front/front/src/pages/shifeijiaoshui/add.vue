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
            <el-input v-model="ruleForm.dikuaibianhao" 
                placeholder="地块编号" clearable :disabled=" false  ||ro.dikuaibianhao"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="种植面积(㎡)" prop="zhongzhimianji">
            <el-input v-model="ruleForm.zhongzhimianji" 
                placeholder="种植面积(㎡)" clearable :disabled=" false  ||ro.zhongzhimianji"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="农场主账号" prop="nongchangzhuzhanghao">
            <el-input v-model="ruleForm.nongchangzhuzhanghao" 
                placeholder="农场主账号" clearable :disabled=" false  ||ro.nongchangzhuzhanghao"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="农场主" prop="nongchangzhu">
            <el-input v-model="ruleForm.nongchangzhu" 
                placeholder="农场主" clearable :disabled=" false  ||ro.nongchangzhu"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="作物名称" prop="zuowumingcheng">
            <el-input v-model="ruleForm.zuowumingcheng" 
                placeholder="作物名称" clearable :disabled=" false  ||ro.zuowumingcheng"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="种植户账号" prop="zhongzhihuzhanghao">
            <el-input v-model="ruleForm.zhongzhihuzhanghao" 
                placeholder="种植户账号" clearable :disabled=" false  ||ro.zhongzhihuzhanghao"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="种植户" prop="zhongzhihu">
            <el-input v-model="ruleForm.zhongzhihu" 
                placeholder="种植户" clearable :disabled=" false  ||ro.zhongzhihu"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="种植图片" v-if="type!='cross' || (type=='cross' && !ro.zhongzhitupian)" prop="zhongzhitupian">
            <file-upload
            tip="点击上传种植图片"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.zhongzhitupian?ruleForm.zhongzhitupian:''"
            @change="zhongzhitupianUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' class="upload" v-else label="种植图片" prop="zhongzhitupian">
                <img v-if="ruleForm.zhongzhitupian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.zhongzhitupian.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.zhongzhitupian.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="施肥量" prop="shifeiliang">
            <el-input v-model="ruleForm.shifeiliang" 
                placeholder="施肥量" clearable :disabled=" false  ||ro.shifeiliang"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="浇水量" prop="jiaoshuiliang">
            <el-input v-model="ruleForm.jiaoshuiliang" 
                placeholder="浇水量" clearable :disabled=" false  ||ro.jiaoshuiliang"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","float":"left","display":"inline-block"}' label="登记时间" prop="dengjishijian">
              <el-date-picker
				  :disabled=" false  ||ro.dengjishijian"
                  format="yyyy 年 MM 月 dd 日"
                  value-format="yyyy-MM-dd"
                  v-model="ruleForm.dengjishijian" 
                  type="date"
                  placeholder="登记时间">
              </el-date-picker> 
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
				zhongzhimianji : false,
				nongchangzhuzhanghao : false,
				nongchangzhu : false,
				zuowumingcheng : false,
				zhongzhihuzhanghao : false,
				zhongzhihu : false,
				zhongzhitupian : false,
				shifeiliang : false,
				jiaoshuiliang : false,
				dengjishijian : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          dikuaibianhao: '',
          zhongzhimianji: '',
          nongchangzhuzhanghao: '',
          nongchangzhu: '',
          zuowumingcheng: '',
          zhongzhihuzhanghao: '',
          zhongzhihu: '',
          zhongzhitupian: '',
          shifeiliang: '',
          jiaoshuiliang: '',
          dengjishijian: '',
        },


        rules: {
          dikuaibianhao: [
          ],
          zhongzhimianji: [
          ],
          nongchangzhuzhanghao: [
          ],
          nongchangzhu: [
          ],
          zuowumingcheng: [
          ],
          zhongzhihuzhanghao: [
          ],
          zhongzhihu: [
          ],
          zhongzhitupian: [
          ],
          shifeiliang: [
            { required: true, message: '施肥量不能为空', trigger: 'blur' },
          ],
          jiaoshuiliang: [
          ],
          dengjishijian: [
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
      this.ruleForm.dengjishijian = this.getCurDate()
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
            if(o=='zhongzhimianji'){
              this.ruleForm.zhongzhimianji = obj[o];
              this.ro.zhongzhimianji = true;
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
            if(o=='zuowumingcheng'){
              this.ruleForm.zuowumingcheng = obj[o];
              this.ro.zuowumingcheng = true;
              continue;
            }
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
            if(o=='zhongzhitupian'){
              this.ruleForm.zhongzhitupian = obj[o].split(",")[0];
              this.ro.zhongzhitupian = true;
              continue;
            }
            if(o=='shifeiliang'){
              this.ruleForm.shifeiliang = obj[o];
              this.ro.shifeiliang = true;
              continue;
            }
            if(o=='jiaoshuiliang'){
              this.ruleForm.jiaoshuiliang = obj[o];
              this.ro.jiaoshuiliang = true;
              continue;
            }
            if(o=='dengjishijian'){
              this.ruleForm.dengjishijian = obj[o];
              this.ro.dengjishijian = true;
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
        this.$http.get(`shifeijiaoshui/detail/${this.$route.query.id}`, {emulateJSON: true}).then(res => {
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
						this.$http.get('shifeijiaoshui/list', {
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


								this.$http.post(`shifeijiaoshui/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
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


						this.$http.post(`shifeijiaoshui/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
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
      zhongzhitupianUploadChange(fileUrls) {
          this.ruleForm.zhongzhitupian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");;
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
