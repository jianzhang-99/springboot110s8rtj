<template>
  <div :style='{"color":"#666","padding":"0px 30px 30px","fontSize":"14px"}'>
    <el-form
	  :style='{"border":"0px solid rgba(255,255,255,1)","padding":"30px 0 10px","borderRadius":"0 0 8px 8px","alignItems":"flex-start","flexWrap":"wrap","background":"rgba(255,255,255,0)","display":"flex","fontSize":"inherit"}'
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      label-width="150px"
    >  
     <el-row>
        <el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}'   v-if="flag=='nongyejishuyuan'"  label="技术员账号" prop="jishuyuanzhanghao">
          <el-input v-model="ruleForm.jishuyuanzhanghao" readonly              placeholder="技术员账号" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}'   v-if="flag=='nongyejishuyuan'"  label="技术员" prop="jishuyuan">
          <el-input v-model="ruleForm.jishuyuan"               placeholder="技术员" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-if="flag=='nongyejishuyuan'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie"  placeholder="请选择性别">
            <el-option
                v-for="(item,index) in nongyejishuyuanxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}'   v-if="flag=='nongyejishuyuan'"  label="年龄" prop="nianling">
          <el-input v-model="ruleForm.nianling"               placeholder="年龄" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-if="flag=='nongyejishuyuan'" label="头像" prop="touxiang">
          <file-upload
          tip="点击上传头像"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
          @change="nongyejishuyuantouxiangUploadChange"
          ></file-upload>
        </el-form-item>
        <el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}'   v-if="flag=='nongyejishuyuan'"  label="技术员手机" prop="jishuyuanshouji">
          <el-input v-model="ruleForm.jishuyuanshouji"               placeholder="技术员手机" clearable></el-input>
        </el-form-item>
		<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-if="flag=='nongyejishuyuan'" label="个人介绍" prop="gerenjieshao">
		  <editor
		  	style="min-width: 200px; max-width: 600px;"
			 :style='{"border":"0px solid #000","width":"100%","boxShadow":"0 0 0px rgba(64, 158, 255, .5)","background":"#fff","height":"auto"}'
		  	v-model="ruleForm.gerenjieshao" 
		  	class="editor" 
		  	action="file/upload">
		  </editor>
		</el-form-item>
        <el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}'   v-if="flag=='zhongzhihu'"  label="种植户账号" prop="zhongzhihuzhanghao">
          <el-input v-model="ruleForm.zhongzhihuzhanghao" readonly              placeholder="种植户账号" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}'   v-if="flag=='zhongzhihu'"  label="种植户" prop="zhongzhihu">
          <el-input v-model="ruleForm.zhongzhihu"               placeholder="种植户" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}'   v-if="flag=='zhongzhihu'"  label="年龄" prop="nianling">
          <el-input v-model="ruleForm.nianling"               placeholder="年龄" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-if="flag=='zhongzhihu'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie"  placeholder="请选择性别">
            <el-option
                v-for="(item,index) in zhongzhihuxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}'   v-if="flag=='zhongzhihu'"  label="联系方式" prop="lianxifangshi">
          <el-input v-model="ruleForm.lianxifangshi"               placeholder="联系方式" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}'   v-if="flag=='zhongzhihu'"  label="邮箱" prop="youxiang">
          <el-input v-model="ruleForm.youxiang"               placeholder="邮箱" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-if="flag=='zhongzhihu'" label="头像" prop="touxiang">
          <file-upload
          tip="点击上传头像"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
          @change="zhongzhihutouxiangUploadChange"
          ></file-upload>
        </el-form-item>
        <el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}'   v-if="flag=='nongchangzhu'"  label="农场主账号" prop="nongchangzhuzhanghao">
          <el-input v-model="ruleForm.nongchangzhuzhanghao" readonly              placeholder="农场主账号" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}'   v-if="flag=='nongchangzhu'"  label="农场主" prop="nongchangzhu">
          <el-input v-model="ruleForm.nongchangzhu"               placeholder="农场主" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-if="flag=='nongchangzhu'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie"  placeholder="请选择性别">
            <el-option
                v-for="(item,index) in nongchangzhuxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}'   v-if="flag=='nongchangzhu'"  label="年龄" prop="nianling">
          <el-input v-model="ruleForm.nianling"               placeholder="年龄" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-if="flag=='nongchangzhu'" label="头像" prop="touxiang">
          <file-upload
          tip="点击上传头像"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
          @change="nongchangzhutouxiangUploadChange"
          ></file-upload>
        </el-form-item>
        <el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}'   v-if="flag=='nongchangzhu'"  label="农场主电话" prop="nongchangzhudianhua">
          <el-input v-model="ruleForm.nongchangzhudianhua"               placeholder="农场主电话" clearable></el-input>
        </el-form-item>
		<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-if="flag=='users'" label="用户名" prop="username">
			<el-input v-model="ruleForm.username" placeholder="用户名"></el-input>
		</el-form-item>
		<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-if="flag=='users'" label="头像" prop="image">
		  <file-upload
		  tip="点击上传头像"
		  action="file/upload"
		  :limit="1"
		  :multiple="false"
		  :fileUrls="ruleForm.image?ruleForm.image:''"
		  @change="usersimageUploadChange"
		  ></file-upload>
		</el-form-item>
		<el-form-item :style='{"padding":"0 10px","margin":"30px 0","alignItems":"center","textAlign":"center","display":"flex","width":"100%","perspective":"320px","-webkitPerspective":"320px","fontSize":"48px","justifyContent":"flex-end"}'>
			<el-button class="btn3" :style='{"border":"0px solid rgba(126, 96, 16, .2)","cursor":"pointer","padding":"0 30px","margin":"0px 20px 0 0","outline":"none","color":"#fff","borderRadius":"4px","background":"#62779c","width":"auto","fontSize":"16px","lineHeight":"24px","height":"40px"}' type="primary" @click="onUpdateHandler">
				<span class="icon iconfont icon-tijiao16" :style='{"margin":"0 2px","fontSize":"18px","color":"inherit","display":"none"}'></span>
				提交
			</el-button>
		</el-form-item>
      </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isPhone,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
      ruleForm: {},
      flag: '',
      usersFlag: false,
      nongyejishuyuanxingbieOptions: [],
      zhongzhihuxingbieOptions: [],
      nongchangzhuxingbieOptions: [],
    };
  },
  mounted() {
    var table = this.$storage.get("sessionTable");
    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
    this.nongyejishuyuanxingbieOptions = "男,女".split(',')
    this.zhongzhihuxingbieOptions = "男,女".split(',')
    this.nongchangzhuxingbieOptions = "男,女".split(',')
  },
  methods: {
    nongyejishuyuantouxiangUploadChange(fileUrls) {
        this.ruleForm.touxiang = fileUrls;
    },
    zhongzhihutouxiangUploadChange(fileUrls) {
        this.ruleForm.touxiang = fileUrls;
    },
    nongchangzhutouxiangUploadChange(fileUrls) {
        this.ruleForm.touxiang = fileUrls;
    },
	usersimageUploadChange(fileUrls) {
		this.ruleForm.image = fileUrls;
	},
    onUpdateHandler() {
      if((!this.ruleForm.jishuyuanzhanghao)&& 'nongyejishuyuan'==this.flag){
        this.$message.error('技术员账号不能为空');
        return
      }


      if((!this.ruleForm.mima)&& 'nongyejishuyuan'==this.flag){
        this.$message.error('密码不能为空');
        return
      }










        if(this.ruleForm.touxiang!=null) {
                this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
        }


      if( 'nongyejishuyuan' ==this.flag && this.ruleForm.jishuyuanshouji&&(!isMobile(this.ruleForm.jishuyuanshouji))){
        this.$message.error(`技术员手机应输入手机格式`);
        return
      }


      if((!this.ruleForm.zhongzhihuzhanghao)&& 'zhongzhihu'==this.flag){
        this.$message.error('种植户账号不能为空');
        return
      }


      if((!this.ruleForm.mima)&& 'zhongzhihu'==this.flag){
        this.$message.error('密码不能为空');
        return
      }


      if((!this.ruleForm.zhongzhihu)&& 'zhongzhihu'==this.flag){
        this.$message.error('种植户不能为空');
        return
      }




      if( 'zhongzhihu' ==this.flag && this.ruleForm.nianling&&(!isIntNumer(this.ruleForm.nianling))){
       this.$message.error(`年龄应输入整数`);
        return
      }




      if( 'zhongzhihu' ==this.flag && this.ruleForm.lianxifangshi&&(!isMobile(this.ruleForm.lianxifangshi))){
        this.$message.error(`联系方式应输入手机格式`);
        return
      }


      if( 'zhongzhihu' ==this.flag && this.ruleForm.youxiang&&(!isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮箱格式`);
        return
      }


        if(this.ruleForm.touxiang!=null) {
                this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
        }
      if((!this.ruleForm.nongchangzhuzhanghao)&& 'nongchangzhu'==this.flag){
        this.$message.error('农场主账号不能为空');
        return
      }


      if((!this.ruleForm.mima)&& 'nongchangzhu'==this.flag){
        this.$message.error('密码不能为空');
        return
      }










        if(this.ruleForm.touxiang!=null) {
                this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
        }


      if( 'nongchangzhu' ==this.flag && this.ruleForm.nongchangzhudianhua&&(!isMobile(this.ruleForm.nongchangzhudianhua))){
        this.$message.error(`农场主电话应输入手机格式`);
        return
      }
      if('users'==this.flag && this.ruleForm.username.trim().length<1) {
	this.$message.error(`用户名不能为空`);
        return	
      }
	  if(this.flag=='users'){
	  	this.ruleForm.image = this.ruleForm.image.replace(new RegExp(this.$base.url,"g"),"")
	  }
      this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
				if(this.flag=='users'){
					this.$storage.set('headportrait',this.ruleForm.image)
				}
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  	  padding: 0 10px 0 0;
	  	  color: #999;
	  	  font-weight: 500;
	  	  display: inline-block;
	  	  width: 150px;
	  	  font-size: inherit;
	  	  line-height: 40px;
	  	  text-align: right;
	  	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 150px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  	  border: 0px solid #000;
	  	  border-radius: 0px;
	  	  padding: 0 12px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: inherit;
	  	  background: #fff;
	  	  width: auto;
	  	  font-size: 14px;
	  	  min-width: 350px;
	  	  height: 36px;
	  	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  	  border: 0px solid #000;
	  	  border-radius: 0px;
	  	  padding: 0 10px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: inherit;
	  	  background: #fff;
	  	  width: auto;
	  	  font-size: 14px;
	  	  min-width: 350px;
	  	  height: 36px;
	  	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  	  border: 0px solid #000;
	  	  border-radius: 0px;
	  	  padding: 0 10px 0 30px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: inherit;
	  	  background: #fff;
	  	  width: auto;
	  	  font-size: 14px;
	  	  min-width: 350px;
	  	  height: 36px;
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
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  	  border: 0px solid #000;
	  	  cursor: pointer;
	  	  border-radius: 0px;
	  	  color: inherit;
	  	  background: #fff;
	  	  object-fit: cover;
	  	  width: 180px;
	  	  font-size: 32px;
	  	  line-height: 90px;
	  	  text-align: center;
	  	  height: 90px;
	  	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  	  border: 0px solid #000;
	  	  cursor: pointer;
	  	  border-radius: 0px;
	  	  color: inherit;
	  	  background: #fff;
	  	  object-fit: cover;
	  	  width: 180px;
	  	  font-size: 32px;
	  	  line-height: 90px;
	  	  text-align: center;
	  	  height: 90px;
	  	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  	  border: 0px solid #000;
	  	  border-radius: 0px;
	  	  padding: 12px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: inherit;
	  	  background: #fff;
	  	  width: auto;
	  	  font-size: 14px;
	  	  min-width: 350px;
	  	  height: 120px;
	  	}
	
	.add-update-preview .btn3 {
				border: 0px solid rgba(126, 96, 16, .2);
				cursor: pointer;
				border-radius: 4px;
				padding: 0 30px;
				margin: 0px 20px 0 0;
				outline: none;
				color: #fff;
				background: #62779c;
				width: auto;
				font-size: 16px;
				line-height: 24px;
				height: 40px;
			}
	
	.add-update-preview .btn3:hover {
				transform: scale(0.9);
				opacity: 0.8;
			}
	
	.editor>.avatar-uploader {
		line-height: 0;
		height: 0;
	}
</style>
