<template>
	<div>

	<div class="container" :style='{"minHeight":"100vh","width":"100%","background":"url(\"http://codegen.caihongy.cn/20231023/595d22725fdb4421ab3806ffa9cde944.png\") 6vw calc(50vh - 150px) / 57vw 55vh fixed no-repeat, url(\"http://codegen.caihongy.cn/20231023/4169fe3a937a4c71a2f8462a8bc2c54c.png\") left top / 100% fixed no-repeat","display":"flex"}'>
		<el-form class='rgs-form' v-if="pageFlag=='register'" :style='{"minHeight":"55vh","border":"1px solid #edeef0","padding":"50px 30px 0","margin":"calc(50vh - 150px) 0 10vh 65vw","borderRadius":"0px","background":"#fff","width":"30vw","minWidth":"400px"}' ref="registerForm" :model="registerForm" :rules="rules">
			<div v-if="false" :style='{"margin":"0 0 10px 0","color":"rgba(64, 158, 255, 1)","textAlign":"center","width":"100%","lineHeight":"44px","fontSize":"20px","textShadow":"4px 4px 2px rgba(64, 158, 255, .5)"}'>USER / REGISTER</div>
			<div v-if="true" :style='{"margin":"0 0 30px 0","color":"#000000","textAlign":"center","width":"100%","lineHeight":"40px","fontSize":"30px","fontWeight":"700"}'>基于Spring Boot的百鲜农业过程化管理系统注册</p></div>
			<el-form-item :style='{"width":"100%","margin":"0 0 20px"}' v-if="tableName=='nongyejishuyuan'" prop="jishuyuanzhanghao">
				<div v-if="true" :style='{"flex-shrink":"0","padding":"0 6px 0 0","color":"#000000","textAlign":"right","width":"100px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('jishuyuanzhanghao')?'required':''">技术员账号：</div>
				<el-input v-model="registerForm.jishuyuanzhanghao"  placeholder="请输入技术员账号" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","margin":"0 0 20px"}' v-if="tableName=='nongyejishuyuan'" prop="mima">
				<div v-if="true" :style='{"flex-shrink":"0","padding":"0 6px 0 0","color":"#000000","textAlign":"right","width":"100px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('mima')?'required':''">密码：</div>
				<el-input v-model="registerForm.mima" type="password" placeholder="请输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","margin":"0 0 20px"}' v-if="tableName=='nongyejishuyuan'" prop="mima2">
				<div v-if="true" :style='{"flex-shrink":"0","padding":"0 6px 0 0","color":"#000000","textAlign":"right","width":"100px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('mima')?'required':''">确认密码：</div>
				<el-input v-model="registerForm.mima2" type="password" placeholder="请再次输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","margin":"0 0 20px"}' v-if="tableName=='nongyejishuyuan'" prop="jishuyuan">
				<div v-if="true" :style='{"flex-shrink":"0","padding":"0 6px 0 0","color":"#000000","textAlign":"right","width":"100px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('jishuyuan')?'required':''">技术员：</div>
				<el-input v-model="registerForm.jishuyuan"  placeholder="请输入技术员" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","margin":"0 0 20px"}' v-if="tableName=='nongyejishuyuan'" prop="xingbie">
				<div v-if="true" :style='{"flex-shrink":"0","padding":"0 6px 0 0","color":"#000000","textAlign":"right","width":"100px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('xingbie')?'required':''">性别：</div>
                <el-select v-model="registerForm.xingbie" placeholder="请选择性别" >
                  <el-option
                      v-for="(item,index) in nongyejishuyuanxingbieOptions"
                      :key="index"
                      :label="item"
                      :value="item">
                  </el-option>
                </el-select>
			</el-form-item>
			<el-form-item :style='{"width":"100%","margin":"0 0 20px"}' v-if="tableName=='nongyejishuyuan'" prop="nianling">
				<div v-if="true" :style='{"flex-shrink":"0","padding":"0 6px 0 0","color":"#000000","textAlign":"right","width":"100px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('nianling')?'required':''">年龄：</div>
				<el-input v-model="registerForm.nianling"  placeholder="请输入年龄" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","margin":"0 0 20px"}' v-if="tableName=='nongyejishuyuan'" prop="touxiang">
				<div v-if="true" :style='{"flex-shrink":"0","padding":"0 6px 0 0","color":"#000000","textAlign":"right","width":"100px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('touxiang')?'required':''">头像：</div>
                <file-upload
					tip="点击上传头像"
					action="file/upload"
					:limit="1"
					:multiple="true"
					:fileUrls="registerForm.touxiang?registerForm.touxiang:''"
					@change="nongyejishuyuantouxiangUploadChange"
				></file-upload>
			</el-form-item>
			<el-form-item :style='{"width":"100%","margin":"0 0 20px"}' v-if="tableName=='nongyejishuyuan'" prop="jishuyuanshouji">
				<div v-if="true" :style='{"flex-shrink":"0","padding":"0 6px 0 0","color":"#000000","textAlign":"right","width":"100px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('jishuyuanshouji')?'required':''">技术员手机：</div>
				<el-input v-model="registerForm.jishuyuanshouji"  placeholder="请输入技术员手机" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","margin":"0 0 20px"}' v-if="tableName=='zhongzhihu'" prop="zhongzhihuzhanghao">
				<div v-if="true" :style='{"flex-shrink":"0","padding":"0 6px 0 0","color":"#000000","textAlign":"right","width":"100px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('zhongzhihuzhanghao')?'required':''">种植户账号：</div>
				<el-input v-model="registerForm.zhongzhihuzhanghao"  placeholder="请输入种植户账号" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","margin":"0 0 20px"}' v-if="tableName=='zhongzhihu'" prop="mima">
				<div v-if="true" :style='{"flex-shrink":"0","padding":"0 6px 0 0","color":"#000000","textAlign":"right","width":"100px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('mima')?'required':''">密码：</div>
				<el-input v-model="registerForm.mima" type="password" placeholder="请输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","margin":"0 0 20px"}' v-if="tableName=='zhongzhihu'" prop="mima2">
				<div v-if="true" :style='{"flex-shrink":"0","padding":"0 6px 0 0","color":"#000000","textAlign":"right","width":"100px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('mima')?'required':''">确认密码：</div>
				<el-input v-model="registerForm.mima2" type="password" placeholder="请再次输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","margin":"0 0 20px"}' v-if="tableName=='zhongzhihu'" prop="zhongzhihu">
				<div v-if="true" :style='{"flex-shrink":"0","padding":"0 6px 0 0","color":"#000000","textAlign":"right","width":"100px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('zhongzhihu')?'required':''">种植户：</div>
				<el-input v-model="registerForm.zhongzhihu"  placeholder="请输入种植户" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","margin":"0 0 20px"}' v-if="tableName=='zhongzhihu'" prop="nianling">
				<div v-if="true" :style='{"flex-shrink":"0","padding":"0 6px 0 0","color":"#000000","textAlign":"right","width":"100px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('nianling')?'required':''">年龄：</div>
				<el-input v-model.number="registerForm.nianling"  placeholder="请输入年龄" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","margin":"0 0 20px"}' v-if="tableName=='zhongzhihu'" prop="xingbie">
				<div v-if="true" :style='{"flex-shrink":"0","padding":"0 6px 0 0","color":"#000000","textAlign":"right","width":"100px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('xingbie')?'required':''">性别：</div>
                <el-select v-model="registerForm.xingbie" placeholder="请选择性别" >
                  <el-option
                      v-for="(item,index) in zhongzhihuxingbieOptions"
                      :key="index"
                      :label="item"
                      :value="item">
                  </el-option>
                </el-select>
			</el-form-item>
			<el-form-item :style='{"width":"100%","margin":"0 0 20px"}' v-if="tableName=='zhongzhihu'" prop="lianxifangshi">
				<div v-if="true" :style='{"flex-shrink":"0","padding":"0 6px 0 0","color":"#000000","textAlign":"right","width":"100px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('lianxifangshi')?'required':''">联系方式：</div>
				<el-input v-model="registerForm.lianxifangshi"  placeholder="请输入联系方式" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","margin":"0 0 20px"}' v-if="tableName=='zhongzhihu'" prop="youxiang">
				<div v-if="true" :style='{"flex-shrink":"0","padding":"0 6px 0 0","color":"#000000","textAlign":"right","width":"100px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('youxiang')?'required':''">邮箱：</div>
				<el-input v-model="registerForm.youxiang"  placeholder="请输入邮箱" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","margin":"0 0 20px"}' v-if="tableName=='zhongzhihu'" prop="touxiang">
				<div v-if="true" :style='{"flex-shrink":"0","padding":"0 6px 0 0","color":"#000000","textAlign":"right","width":"100px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('touxiang')?'required':''">头像：</div>
                <file-upload
					tip="点击上传头像"
					action="file/upload"
					:limit="1"
					:multiple="true"
					:fileUrls="registerForm.touxiang?registerForm.touxiang:''"
					@change="zhongzhihutouxiangUploadChange"
				></file-upload>
			</el-form-item>
			<el-form-item :style='{"width":"100%","margin":"0 0 20px"}' v-if="tableName=='nongchangzhu'" prop="nongchangzhuzhanghao">
				<div v-if="true" :style='{"flex-shrink":"0","padding":"0 6px 0 0","color":"#000000","textAlign":"right","width":"100px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('nongchangzhuzhanghao')?'required':''">农场主账号：</div>
				<el-input v-model="registerForm.nongchangzhuzhanghao"  placeholder="请输入农场主账号" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","margin":"0 0 20px"}' v-if="tableName=='nongchangzhu'" prop="mima">
				<div v-if="true" :style='{"flex-shrink":"0","padding":"0 6px 0 0","color":"#000000","textAlign":"right","width":"100px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('mima')?'required':''">密码：</div>
				<el-input v-model="registerForm.mima" type="password" placeholder="请输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","margin":"0 0 20px"}' v-if="tableName=='nongchangzhu'" prop="mima2">
				<div v-if="true" :style='{"flex-shrink":"0","padding":"0 6px 0 0","color":"#000000","textAlign":"right","width":"100px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('mima')?'required':''">确认密码：</div>
				<el-input v-model="registerForm.mima2" type="password" placeholder="请再次输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","margin":"0 0 20px"}' v-if="tableName=='nongchangzhu'" prop="nongchangzhu">
				<div v-if="true" :style='{"flex-shrink":"0","padding":"0 6px 0 0","color":"#000000","textAlign":"right","width":"100px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('nongchangzhu')?'required':''">农场主：</div>
				<el-input v-model="registerForm.nongchangzhu"  placeholder="请输入农场主" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","margin":"0 0 20px"}' v-if="tableName=='nongchangzhu'" prop="xingbie">
				<div v-if="true" :style='{"flex-shrink":"0","padding":"0 6px 0 0","color":"#000000","textAlign":"right","width":"100px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('xingbie')?'required':''">性别：</div>
                <el-select v-model="registerForm.xingbie" placeholder="请选择性别" >
                  <el-option
                      v-for="(item,index) in nongchangzhuxingbieOptions"
                      :key="index"
                      :label="item"
                      :value="item">
                  </el-option>
                </el-select>
			</el-form-item>
			<el-form-item :style='{"width":"100%","margin":"0 0 20px"}' v-if="tableName=='nongchangzhu'" prop="nianling">
				<div v-if="true" :style='{"flex-shrink":"0","padding":"0 6px 0 0","color":"#000000","textAlign":"right","width":"100px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('nianling')?'required':''">年龄：</div>
				<el-input v-model="registerForm.nianling"  placeholder="请输入年龄" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","margin":"0 0 20px"}' v-if="tableName=='nongchangzhu'" prop="touxiang">
				<div v-if="true" :style='{"flex-shrink":"0","padding":"0 6px 0 0","color":"#000000","textAlign":"right","width":"100px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('touxiang')?'required':''">头像：</div>
                <file-upload
					tip="点击上传头像"
					action="file/upload"
					:limit="1"
					:multiple="true"
					:fileUrls="registerForm.touxiang?registerForm.touxiang:''"
					@change="nongchangzhutouxiangUploadChange"
				></file-upload>
			</el-form-item>
			<el-form-item :style='{"width":"100%","margin":"0 0 20px"}' v-if="tableName=='nongchangzhu'" prop="nongchangzhudianhua">
				<div v-if="true" :style='{"flex-shrink":"0","padding":"0 6px 0 0","color":"#000000","textAlign":"right","width":"100px","lineHeight":"44px","fontSize":"14px"}' :class="changeRules('nongchangzhudianhua')?'required':''">农场主电话：</div>
				<el-input v-model="registerForm.nongchangzhudianhua"  placeholder="请输入农场主电话" />
			</el-form-item>
			<el-button :style='{"border":"0","cursor":"pointer","padding":"0 10px","margin":"20px auto 5px","outline":"none","color":"#fff","borderRadius":"8px","background":"#00AA3A","display":"block","width":"80%","fontSize":"16px","height":"44px"}' type="primary" @click="submitForm('registerForm')">注册</el-button>
			<el-button :style='{"border":"1px solid","cursor":"pointer","padding":"0 10px","margin":"20px auto 5px","outline":"none","color":"#000","borderRadius":"8px","background":"#fff","display":"block","width":"80%","fontSize":"16px","height":"44px"}' @click="resetForm('registerForm')">重置</el-button>
			<router-link :style='{"cursor":"pointer","padding":"20px 10%","color":"rgba(159, 159, 159, 1)","display":"flex","lineHeight":"1","fontSize":"14px","textDecoration":"none","justifyContent":"center"}' to="/login">已有账户登录</router-link>
			<div class="idea1" :style='{"width":"100%","background":"red","display":"none","height":"40px"}'></div>
			<div class="idea2" :style='{"width":"100%","background":"blue","display":"none","height":"40px"}'></div>
		</el-form>
    </div>
  </div>
</div>
</template>

<script>

export default {
    //数据集合
    data() {
		return {
            pageFlag : '',
			tableName: '',
			registerForm: {},
			forgetForm: {},
			rules: {},
			requiredRules: {},
            nongyejishuyuanxingbieOptions: [],
            zhongzhihuxingbieOptions: [],
            nongchangzhuxingbieOptions: [],
		}
    },
	mounted() {
		if(this.$route.query.pageFlag=='register'){
			
			this.tableName = this.$route.query.role;
			if(this.tableName=='nongyejishuyuan'){
				this.registerForm = {
					jishuyuanzhanghao: '',
					mima: '',
					mima2: '',
					jishuyuan: '',
					xingbie: '',
					nianling: '',
					touxiang: '',
					jishuyuanshouji: '',
					gerenjieshao: '',
				}
			}
			if(this.tableName=='zhongzhihu'){
				this.registerForm = {
					zhongzhihuzhanghao: '',
					mima: '',
					mima2: '',
					zhongzhihu: '',
					nianling: '',
					xingbie: '',
					lianxifangshi: '',
					youxiang: '',
					touxiang: '',
				}
			}
			if(this.tableName=='nongchangzhu'){
				this.registerForm = {
					nongchangzhuzhanghao: '',
					mima: '',
					mima2: '',
					nongchangzhu: '',
					xingbie: '',
					nianling: '',
					touxiang: '',
					nongchangzhudianhua: '',
				}
			}
			if ('nongyejishuyuan' == this.tableName) {
				this.requiredRules.jishuyuanzhanghao = [{ required: true, message: '请输入技术员账号', trigger: 'blur' }]
			}
			if ('nongyejishuyuan' == this.tableName) {
				this.requiredRules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }]
			}
			if ('zhongzhihu' == this.tableName) {
				this.requiredRules.zhongzhihuzhanghao = [{ required: true, message: '请输入种植户账号', trigger: 'blur' }]
			}
			if ('zhongzhihu' == this.tableName) {
				this.requiredRules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }]
			}
			if ('zhongzhihu' == this.tableName) {
				this.requiredRules.zhongzhihu = [{ required: true, message: '请输入种植户', trigger: 'blur' }]
			}
			if ('nongchangzhu' == this.tableName) {
				this.requiredRules.nongchangzhuzhanghao = [{ required: true, message: '请输入农场主账号', trigger: 'blur' }]
			}
			if ('nongchangzhu' == this.tableName) {
				this.requiredRules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }]
			}
		}
	},
    created() {
		this.pageFlag = this.$route.query.pageFlag;
		if(this.$route.query.pageFlag=='register'){
		  if ('nongyejishuyuan' == this.tableName) {
			this.rules.jishuyuanzhanghao = [{ required: true, message: '请输入技术员账号', trigger: 'blur' }];
		  }
		  if ('nongyejishuyuan' == this.tableName) {
			this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }];
		  }
			this.nongyejishuyuanxingbieOptions = "男,女".split(',');
		  if ('nongyejishuyuan' == this.tableName) {
			this.rules.jishuyuanshouji = [{ required: true, validator: this.$validate.isMobile, trigger: 'blur' }];
		  }
		  if ('zhongzhihu' == this.tableName) {
			this.rules.zhongzhihuzhanghao = [{ required: true, message: '请输入种植户账号', trigger: 'blur' }];
		  }
		  if ('zhongzhihu' == this.tableName) {
			this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }];
		  }
		  if ('zhongzhihu' == this.tableName) {
			this.rules.zhongzhihu = [{ required: true, message: '请输入种植户', trigger: 'blur' }];
		  }
		  if ('zhongzhihu' == this.tableName) {
			this.rules.nianling = [{ required: true, validator: this.$validate.isIntNumer, trigger: 'blur' }];
		  }
			this.zhongzhihuxingbieOptions = "男,女".split(',');
		  if ('zhongzhihu' == this.tableName) {
			this.rules.lianxifangshi = [{ required: true, validator: this.$validate.isMobile, trigger: 'blur' }];
		  }
		  if ('zhongzhihu' == this.tableName) {
			this.rules.youxiang = [{ required: true, validator: this.$validate.isEmail, trigger: 'blur' }];
		  }
		  if ('nongchangzhu' == this.tableName) {
			this.rules.nongchangzhuzhanghao = [{ required: true, message: '请输入农场主账号', trigger: 'blur' }];
		  }
		  if ('nongchangzhu' == this.tableName) {
			this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }];
		  }
			this.nongchangzhuxingbieOptions = "男,女".split(',');
		  if ('nongchangzhu' == this.tableName) {
			this.rules.nongchangzhudianhua = [{ required: true, validator: this.$validate.isMobile, trigger: 'blur' }];
		  }
		}
    },
    //方法集合
    methods: {
		changeRules(name){
			if(this.requiredRules[name]){
				return true
			}
			return false
		},
      // 获取uuid
      getUUID () {
        return new Date().getTime();
      },
        // 下二随
      nongyejishuyuantouxiangUploadChange(fileUrls) {
          this.registerForm.touxiang = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },
      zhongzhihutouxiangUploadChange(fileUrls) {
          this.registerForm.touxiang = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },
      nongchangzhutouxiangUploadChange(fileUrls) {
          this.registerForm.touxiang = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },

        // 多级联动参数


      submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            var url=this.tableName+"/register";
				if((!this.registerForm.jishuyuanzhanghao) && `nongyejishuyuan` == this.tableName){
					this.$message.error(`技术员账号不能为空`);
					return
				}
               if(`nongyejishuyuan` == this.tableName && this.registerForm.mima!=this.registerForm.mima2) {
                this.$message.error(`两次密码输入不一致`);
                return
               }
				if((!this.registerForm.mima) && `nongyejishuyuan` == this.tableName){
					this.$message.error(`密码不能为空`);
					return
				}
					if(`nongyejishuyuan` == this.tableName && this.registerForm.jishuyuanshouji &&(!this.$validate.isMobile2(this.registerForm.jishuyuanshouji))){
						this.$message.error(`技术员手机应输入手机格式`);
						return
					}
				if((!this.registerForm.zhongzhihuzhanghao) && `zhongzhihu` == this.tableName){
					this.$message.error(`种植户账号不能为空`);
					return
				}
               if(`zhongzhihu` == this.tableName && this.registerForm.mima!=this.registerForm.mima2) {
                this.$message.error(`两次密码输入不一致`);
                return
               }
				if((!this.registerForm.mima) && `zhongzhihu` == this.tableName){
					this.$message.error(`密码不能为空`);
					return
				}
				if((!this.registerForm.zhongzhihu) && `zhongzhihu` == this.tableName){
					this.$message.error(`种植户不能为空`);
					return
				}
				if(`zhongzhihu` == this.tableName && this.registerForm.nianling &&(!this.$validate.isIntNumer2(this.registerForm.nianling))){
					this.$message.error(`年龄应输入整数`);
					return
				}
					if(`zhongzhihu` == this.tableName && this.registerForm.lianxifangshi &&(!this.$validate.isMobile2(this.registerForm.lianxifangshi))){
						this.$message.error(`联系方式应输入手机格式`);
						return
					}
					if(`zhongzhihu` == this.tableName && this.registerForm.youxiang &&(!this.$validate.isEmail2(this.registerForm.youxiang))){
						this.$message.error(`邮箱应输入邮件格式`);
						return
					}
				if((!this.registerForm.nongchangzhuzhanghao) && `nongchangzhu` == this.tableName){
					this.$message.error(`农场主账号不能为空`);
					return
				}
               if(`nongchangzhu` == this.tableName && this.registerForm.mima!=this.registerForm.mima2) {
                this.$message.error(`两次密码输入不一致`);
                return
               }
				if((!this.registerForm.mima) && `nongchangzhu` == this.tableName){
					this.$message.error(`密码不能为空`);
					return
				}
					if(`nongchangzhu` == this.tableName && this.registerForm.nongchangzhudianhua &&(!this.$validate.isMobile2(this.registerForm.nongchangzhudianhua))){
						this.$message.error(`农场主电话应输入手机格式`);
						return
					}
            this.$http.post(url, this.registerForm).then(res => {
              if (res.data.code === 0) {
                this.$message({
                  message: '注册成功',
                  type: 'success',
                  duration: 1500,
                  onClose: () => {
                    this.$router.push('/login');
                  }
                });
              } else {
                this.$message.error(res.data.msg);
              }
            });
          } else {
            return false;
          }
        });
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.container {
		position: relative;
		background: url("http://codegen.caihongy.cn/20231023/595d22725fdb4421ab3806ffa9cde944.png") 6vw calc(50vh - 150px) / 57vw 55vh fixed no-repeat, url("http://codegen.caihongy.cn/20231023/4169fe3a937a4c71a2f8462a8bc2c54c.png") left top / 100% fixed no-repeat;
		
		.el-input {
		  width: auto;
		}
		
		.el-date-editor.el-input {
			width: auto;
		}
		
		.el-form-item /deep/ .el-form-item__content {
						display: flex;
					}
		
		.rgs-form .el-input /deep/ .el-input__inner {
						border: 1px solid #C7C7C7;
						border-radius: 4px;
						padding: 0 10px;
						color: #000000;
						width: 288px;
						font-size: 14px;
						height: 36px;
					}
		
		.rgs-form .el-select /deep/ .el-input__inner {
						border: 1px solid #C7C7C7;
						border-radius: 4px;
						padding: 0 10px;
						color: #000000;
						width: 288px;
						font-size: 14px;
						height: 36px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 1px solid #C7C7C7;
						border-radius: 4px;
						padding: 0 10px 0 30px;
						color: #000000;
						width: 288px;
						font-size: 14px;
						height: 36px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 1px solid #C7C7C7;
						border-radius: 4px;
						padding: 0 10px 0 30px;
						color: #000000;
						width: 288px;
						font-size: 14px;
						height: 36px;
					}
		
		.rgs-form /deep/ .el-upload--picture-card {
			background: transparent;
			border: 0;
			border-radius: 0;
			width: auto;
			height: auto;
			line-height: initial;
			vertical-align: middle;
		}
		
		.rgs-form /deep/ .upload .upload-img {
		  		  border: 1px solid #C7C7C7;
		  		  cursor: pointer;
		  		  border-radius: 4px;
		  		  color: #C7C7C7;
		  		  width: 60px;
		  		  font-size: 32px;
		  		  line-height: 60px;
		  		  text-align: center;
		  		  height: 60px;
		  		}
		
		.rgs-form /deep/ .el-upload-list .el-upload-list__item {
		  		  border: 1px solid #C7C7C7;
		  		  cursor: pointer;
		  		  border-radius: 4px;
		  		  color: #C7C7C7;
		  		  width: 60px;
		  		  font-size: 32px;
		  		  line-height: 60px;
		  		  text-align: center;
		  		  height: 60px;
		  		}
		
		.rgs-form /deep/ .el-upload .el-icon-plus {
		  		  border: 1px solid #C7C7C7;
		  		  cursor: pointer;
		  		  border-radius: 4px;
		  		  color: #C7C7C7;
		  		  width: 60px;
		  		  font-size: 32px;
		  		  line-height: 60px;
		  		  text-align: center;
		  		  height: 60px;
		  		}
	}
	.required {
		position: relative;
	}
	.required::after{
				color: red;
				left: 90px;
				position: absolute;
				content: "*";
			}
</style>
