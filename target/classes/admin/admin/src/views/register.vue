<template>
	<div>
		<div class="container" :style='{"minHeight":"100vh","alignItems":"center","background":"url(http://codegen.caihongy.cn/20230930/02567f8bbf29475095a68adeb32aa995.jpg)","display":"flex","width":"100%","backgroundSize":"100% 100%","backgroundPosition":"center bottom","backgroundRepeat":"no-repeat","justifyContent":"center"}'>
			<el-form v-if="pageFlag=='register'" :style='{"border":"0px solid #f6f6f6","padding":"30px 5% 20px 45%","margin":"50px auto 50px","borderRadius":"0px","textAlign":"center","background":"url(http://codegen.caihongy.cn/20230930/f52d5a109d7248d69a33749b059f901d.jpg) no-repeat left center / 50% 101%,#fff","width":"75%","height":"auto"}' ref="rgsForm" class="rgs-form" :model="rgsForm" :rules="rules">
				<div v-if="true" :style='{"padding":"0px","margin":"0px auto 20px","borderColor":"#eee","color":"#57759b","textAlign":"center","display":"inline-block","background":"#fff","borderWidth":"0px","width":"100%","lineHeight":"40px","fontSize":"24px","borderStyle":"solid","fontWeight":"600"}' class="title">基于Spring Boot的百鲜农业过程化管理系统注册</div>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","flexWrap":"wrap","display":"block","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='nongyejishuyuan'">
					<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","left":"-150px","display":"inline-block","width":"150px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('jishuyuanzhanghao')?'required':''">技术员账号：</div>
					<el-input  v-model="ruleForm.jishuyuanzhanghao"  autocomplete="off" placeholder="技术员账号"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","flexWrap":"wrap","display":"block","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='nongyejishuyuan'">
					<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","left":"-150px","display":"inline-block","width":"150px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('mima')?'required':''">密码：</div>
					<el-input  v-model="ruleForm.mima"  autocomplete="off" placeholder="密码"  type="password"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","flexWrap":"wrap","display":"block","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='nongyejishuyuan'">
					<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","left":"-150px","display":"inline-block","width":"150px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('mima')?'required':''">确认密码：</div>
					<el-input  v-model="ruleForm.mima2" autocomplete="off" placeholder="确认密码" type="password" />
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","flexWrap":"wrap","display":"block","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='nongyejishuyuan'">
					<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","left":"-150px","display":"inline-block","width":"150px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('jishuyuan')?'required':''">技术员：</div>
					<el-input  v-model="ruleForm.jishuyuan"  autocomplete="off" placeholder="技术员"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","flexWrap":"wrap","display":"block","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='nongyejishuyuan'">
					<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","left":"-150px","display":"inline-block","width":"150px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('xingbie')?'required':''">性别：</div>
                    <el-select v-model="ruleForm.xingbie" placeholder="请选择性别" >
                        <el-option
                            v-for="(item,index) in nongyejishuyuanxingbieOptions"
                            v-bind:key="index"
                            :label="item"
                            :value="item">
                        </el-option>
                    </el-select>
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","flexWrap":"wrap","display":"block","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='nongyejishuyuan'">
					<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","left":"-150px","display":"inline-block","width":"150px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('nianling')?'required':''">年龄：</div>
					<el-input  v-model="ruleForm.nianling"  autocomplete="off" placeholder="年龄"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","flexWrap":"wrap","display":"block","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='nongyejishuyuan'">
					<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","left":"-150px","display":"inline-block","width":"150px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('touxiang')?'required':''">头像：</div>
                    <file-upload
                        tip="点击上传头像"
                        action="file/upload"
                        :limit="3"
                        :multiple="true"
                        :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
                        @change="nongyejishuyuantouxiangUploadChange"
                    ></file-upload>
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","flexWrap":"wrap","display":"block","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='nongyejishuyuan'">
					<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","left":"-150px","display":"inline-block","width":"150px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('jishuyuanshouji')?'required':''">技术员手机：</div>
					<el-input  v-model="ruleForm.jishuyuanshouji"  autocomplete="off" placeholder="技术员手机"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","flexWrap":"wrap","display":"block","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='zhongzhihu'">
					<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","left":"-150px","display":"inline-block","width":"150px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('zhongzhihuzhanghao')?'required':''">种植户账号：</div>
					<el-input  v-model="ruleForm.zhongzhihuzhanghao"  autocomplete="off" placeholder="种植户账号"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","flexWrap":"wrap","display":"block","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='zhongzhihu'">
					<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","left":"-150px","display":"inline-block","width":"150px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('mima')?'required':''">密码：</div>
					<el-input  v-model="ruleForm.mima"  autocomplete="off" placeholder="密码"  type="password"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","flexWrap":"wrap","display":"block","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='zhongzhihu'">
					<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","left":"-150px","display":"inline-block","width":"150px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('mima')?'required':''">确认密码：</div>
					<el-input  v-model="ruleForm.mima2" autocomplete="off" placeholder="确认密码" type="password" />
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","flexWrap":"wrap","display":"block","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='zhongzhihu'">
					<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","left":"-150px","display":"inline-block","width":"150px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('zhongzhihu')?'required':''">种植户：</div>
					<el-input  v-model="ruleForm.zhongzhihu"  autocomplete="off" placeholder="种植户"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","flexWrap":"wrap","display":"block","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='zhongzhihu'">
					<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","left":"-150px","display":"inline-block","width":"150px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('nianling')?'required':''">年龄：</div>
					<el-input  v-model.number="ruleForm.nianling"  autocomplete="off" placeholder="年龄"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","flexWrap":"wrap","display":"block","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='zhongzhihu'">
					<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","left":"-150px","display":"inline-block","width":"150px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('xingbie')?'required':''">性别：</div>
                    <el-select v-model="ruleForm.xingbie" placeholder="请选择性别" >
                        <el-option
                            v-for="(item,index) in zhongzhihuxingbieOptions"
                            v-bind:key="index"
                            :label="item"
                            :value="item">
                        </el-option>
                    </el-select>
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","flexWrap":"wrap","display":"block","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='zhongzhihu'">
					<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","left":"-150px","display":"inline-block","width":"150px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('lianxifangshi')?'required':''">联系方式：</div>
					<el-input  v-model="ruleForm.lianxifangshi"  autocomplete="off" placeholder="联系方式"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","flexWrap":"wrap","display":"block","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='zhongzhihu'">
					<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","left":"-150px","display":"inline-block","width":"150px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('youxiang')?'required':''">邮箱：</div>
					<el-input  v-model="ruleForm.youxiang"  autocomplete="off" placeholder="邮箱"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","flexWrap":"wrap","display":"block","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='zhongzhihu'">
					<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","left":"-150px","display":"inline-block","width":"150px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('touxiang')?'required':''">头像：</div>
                    <file-upload
                        tip="点击上传头像"
                        action="file/upload"
                        :limit="3"
                        :multiple="true"
                        :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
                        @change="zhongzhihutouxiangUploadChange"
                    ></file-upload>
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","flexWrap":"wrap","display":"block","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='nongchangzhu'">
					<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","left":"-150px","display":"inline-block","width":"150px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('nongchangzhuzhanghao')?'required':''">农场主账号：</div>
					<el-input  v-model="ruleForm.nongchangzhuzhanghao"  autocomplete="off" placeholder="农场主账号"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","flexWrap":"wrap","display":"block","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='nongchangzhu'">
					<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","left":"-150px","display":"inline-block","width":"150px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('mima')?'required':''">密码：</div>
					<el-input  v-model="ruleForm.mima"  autocomplete="off" placeholder="密码"  type="password"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","flexWrap":"wrap","display":"block","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='nongchangzhu'">
					<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","left":"-150px","display":"inline-block","width":"150px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('mima')?'required':''">确认密码：</div>
					<el-input  v-model="ruleForm.mima2" autocomplete="off" placeholder="确认密码" type="password" />
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","flexWrap":"wrap","display":"block","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='nongchangzhu'">
					<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","left":"-150px","display":"inline-block","width":"150px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('nongchangzhu')?'required':''">农场主：</div>
					<el-input  v-model="ruleForm.nongchangzhu"  autocomplete="off" placeholder="农场主"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","flexWrap":"wrap","display":"block","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='nongchangzhu'">
					<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","left":"-150px","display":"inline-block","width":"150px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('xingbie')?'required':''">性别：</div>
                    <el-select v-model="ruleForm.xingbie" placeholder="请选择性别" >
                        <el-option
                            v-for="(item,index) in nongchangzhuxingbieOptions"
                            v-bind:key="index"
                            :label="item"
                            :value="item">
                        </el-option>
                    </el-select>
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","flexWrap":"wrap","display":"block","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='nongchangzhu'">
					<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","left":"-150px","display":"inline-block","width":"150px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('nianling')?'required':''">年龄：</div>
					<el-input  v-model="ruleForm.nianling"  autocomplete="off" placeholder="年龄"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","flexWrap":"wrap","display":"block","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='nongchangzhu'">
					<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","left":"-150px","display":"inline-block","width":"150px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('touxiang')?'required':''">头像：</div>
                    <file-upload
                        tip="点击上传头像"
                        action="file/upload"
                        :limit="3"
                        :multiple="true"
                        :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
                        @change="nongchangzhutouxiangUploadChange"
                    ></file-upload>
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","flexWrap":"wrap","display":"block","width":"100%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='nongchangzhu'">
					<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","left":"-150px","display":"inline-block","width":"150px","lineHeight":"40px","fontSize":"14px","position":"absolute","order":"2"}' class="lable" :class="changeRules('nongchangzhudianhua')?'required':''">农场主电话：</div>
					<el-input  v-model="ruleForm.nongchangzhudianhua"  autocomplete="off" placeholder="农场主电话"  type="text"  />
				</el-form-item>
				<button :style='{"border":"2px solid #57759b","cursor":"pointer","padding":"0px","boxShadow":"0 0 0px rgba(64, 158, 255, .5)","margin":"20px auto 5px","color":"#57759b","display":"inline-block","letterSpacing":"4px","outline":"none","borderRadius":"0px","background":"none","width":"49%","fontSize":"18px","fontWeight":"600","height":"50px"}' type="button" class="r-btn" @click="login()">注册</button>
				<div :style='{"cursor":"pointer","padding":"0 0px","margin":"10px 0 0","color":"#57759b","textAlign":"right","display":"inline-block","width":"49%","lineHeight":"1","fontSize":"14px"}' class="r-login" @click="close()">已有账号，直接登录</div>
			</el-form>
			
		</div>
	</div>
</template>

<script>
export default {
	data() {
		return {
			ruleForm: {
			},
			forgetForm: {},
            pageFlag : '',
			tableName:"",
			rules: {},
            nongyejishuyuanxingbieOptions: [],
            zhongzhihuxingbieOptions: [],
            nongchangzhuxingbieOptions: [],
		};
	},
	mounted(){
		this.pageFlag = this.$route.query.pageFlag
		if(this.$route.query.pageFlag=='register'){
			
			let table = this.$storage.get("loginTable");
			this.tableName = table;
			if(this.tableName=='nongyejishuyuan'){
				this.ruleForm = {
					jishuyuanzhanghao: '',
					mima: '',
					jishuyuan: '',
					xingbie: '',
					nianling: '',
					touxiang: '',
					jishuyuanshouji: '',
					gerenjieshao: '',
				}
			}
			if(this.tableName=='zhongzhihu'){
				this.ruleForm = {
					zhongzhihuzhanghao: '',
					mima: '',
					zhongzhihu: '',
					nianling: '',
					xingbie: '',
					lianxifangshi: '',
					youxiang: '',
					touxiang: '',
				}
			}
			if(this.tableName=='nongchangzhu'){
				this.ruleForm = {
					nongchangzhuzhanghao: '',
					mima: '',
					nongchangzhu: '',
					xingbie: '',
					nianling: '',
					touxiang: '',
					nongchangzhudianhua: '',
				}
			}
			if ('nongyejishuyuan' == this.tableName) {
				this.rules.jishuyuanzhanghao = [{ required: true, message: '请输入技术员账号', trigger: 'blur' }]
			}
			if ('nongyejishuyuan' == this.tableName) {
				this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }]
			}
			if ('zhongzhihu' == this.tableName) {
				this.rules.zhongzhihuzhanghao = [{ required: true, message: '请输入种植户账号', trigger: 'blur' }]
			}
			if ('zhongzhihu' == this.tableName) {
				this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }]
			}
			if ('zhongzhihu' == this.tableName) {
				this.rules.zhongzhihu = [{ required: true, message: '请输入种植户', trigger: 'blur' }]
			}
			if ('nongchangzhu' == this.tableName) {
				this.rules.nongchangzhuzhanghao = [{ required: true, message: '请输入农场主账号', trigger: 'blur' }]
			}
			if ('nongchangzhu' == this.tableName) {
				this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }]
			}
			this.nongyejishuyuanxingbieOptions = "男,女".split(',')
			this.zhongzhihuxingbieOptions = "男,女".split(',')
			this.nongchangzhuxingbieOptions = "男,女".split(',')
		}
	},
	created() {
	},
	destroyed() {
		  	},
	methods: {
		changeRules(name){
			if(this.rules[name]){
				return true
			}
			return false
		},
		// 获取uuid
		getUUID () {
			return new Date().getTime();
		},
		close(){
			this.$router.push({ path: "/login" });
		},
        nongyejishuyuantouxiangUploadChange(fileUrls) {
            this.ruleForm.touxiang = fileUrls;
        },
        zhongzhihutouxiangUploadChange(fileUrls) {
            this.ruleForm.touxiang = fileUrls;
        },
        nongchangzhutouxiangUploadChange(fileUrls) {
            this.ruleForm.touxiang = fileUrls;
        },

        // 多级联动参数


		// 注册
		login() {
			var url=this.tableName+"/register";
					if((!this.ruleForm.jishuyuanzhanghao) && `nongyejishuyuan` == this.tableName){
						this.$message.error(`技术员账号不能为空`);
						return
					}
					if((!this.ruleForm.mima) && `nongyejishuyuan` == this.tableName){
						this.$message.error(`密码不能为空`);
						return
					}
					if((this.ruleForm.mima!=this.ruleForm.mima2) && `nongyejishuyuan` == this.tableName){
						this.$message.error(`两次密码输入不一致`);
						return
					}
            if(this.ruleForm.touxiang!=null) {
                this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
            }
					if(`nongyejishuyuan` == this.tableName && this.ruleForm.jishuyuanshouji &&(!this.$validate.isMobile(this.ruleForm.jishuyuanshouji))){
						this.$message.error(`技术员手机应输入手机格式`);
						return
					}
					if((!this.ruleForm.zhongzhihuzhanghao) && `zhongzhihu` == this.tableName){
						this.$message.error(`种植户账号不能为空`);
						return
					}
					if((!this.ruleForm.mima) && `zhongzhihu` == this.tableName){
						this.$message.error(`密码不能为空`);
						return
					}
					if((this.ruleForm.mima!=this.ruleForm.mima2) && `zhongzhihu` == this.tableName){
						this.$message.error(`两次密码输入不一致`);
						return
					}
					if((!this.ruleForm.zhongzhihu) && `zhongzhihu` == this.tableName){
						this.$message.error(`种植户不能为空`);
						return
					}
					if(`zhongzhihu` == this.tableName && this.ruleForm.nianling &&(!this.$validate.isIntNumer(this.ruleForm.nianling))){
						this.$message.error(`年龄应输入整数`);
						return
					}
					if(`zhongzhihu` == this.tableName && this.ruleForm.lianxifangshi &&(!this.$validate.isMobile(this.ruleForm.lianxifangshi))){
						this.$message.error(`联系方式应输入手机格式`);
						return
					}
					if(`zhongzhihu` == this.tableName && this.ruleForm.youxiang &&(!this.$validate.isEmail(this.ruleForm.youxiang))){
						this.$message.error(`邮箱应输入邮件格式`);
						return
					}
            if(this.ruleForm.touxiang!=null) {
                this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
            }
					if((!this.ruleForm.nongchangzhuzhanghao) && `nongchangzhu` == this.tableName){
						this.$message.error(`农场主账号不能为空`);
						return
					}
					if((!this.ruleForm.mima) && `nongchangzhu` == this.tableName){
						this.$message.error(`密码不能为空`);
						return
					}
					if((this.ruleForm.mima!=this.ruleForm.mima2) && `nongchangzhu` == this.tableName){
						this.$message.error(`两次密码输入不一致`);
						return
					}
            if(this.ruleForm.touxiang!=null) {
                this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
            }
					if(`nongchangzhu` == this.tableName && this.ruleForm.nongchangzhudianhua &&(!this.$validate.isMobile(this.ruleForm.nongchangzhudianhua))){
						this.$message.error(`农场主电话应输入手机格式`);
						return
					}
			this.$http({
				url: url,
				method: "post",
				data:this.ruleForm
			}).then(({ data }) => {
				if (data && data.code === 0) {
					this.$message({
						message: "注册成功",
						type: "success",
						duration: 1500,
						onClose: () => {
							this.$router.replace({ path: "/login" });
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
	.container {
	  position: relative;
	  background: url(http://codegen.caihongy.cn/20230930/02567f8bbf29475095a68adeb32aa995.jpg);

		.el-date-editor.el-input {
		  width: 100%;
		}
		
		.rgs-form .el-input /deep/ .el-input__inner {
						border-radius: 0px;
						padding: 0 10px;
						box-shadow: 0 0 0px rgba(64, 158, 255, .3);
						outline: none;
						color: #999;
						background: #fff;
						width: 100%;
						font-size: 14px;
						border-color: #62779c;
						border-width: 0 0 2px;
						border-style: solid;
						height: 40px;
					}
		
		.rgs-form .el-select /deep/ .el-input__inner {
						border-radius: 0px;
						padding: 0 10px;
						box-shadow: 0 0 0px rgba(64, 158, 255, .3);
						outline: none;
						color: #999;
						background: #fff;
						width: 100%;
						font-size: 14px;
						border-color: #62779c;
						border-width: 0 0 2px;
						border-style: solid;
						height: 40px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border-radius: 0px;
						padding: 0 10px 0 30px;
						box-shadow: 0 0 0px rgba(64, 158, 255, .3);
						outline: none;
						color: #999;
						background: #fff;
						width: 100%;
						font-size: 14px;
						border-color: #62779c;
						border-width: 0 0 2px;
						border-style: solid;
						height: 40px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border-radius: 0px;
						padding: 0 10px 0 30px;
						box-shadow: 0 0 0px rgba(64, 158, 255, .3);
						outline: none;
						color: #999;
						background: #fff;
						width: 100%;
						font-size: 14px;
						border-color: #62779c;
						border-width: 0 0 2px;
						border-style: solid;
						height: 40px;
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
		  		  border: 2px solid #62779c;
		  		  cursor: pointer;
		  		  border-radius: 0px;
		  		  color: #62779c;
		  		  background: #fff;
		  		  font-weight: 600;
		  		  width: 80px;
		  		  font-size: 20px;
		  		  line-height: 40px;
		  		  text-align: center;
		  		  height: 40px;
		  		}
		
		.rgs-form /deep/ .el-upload-list .el-upload-list__item {
		  		  border: 2px solid #62779c;
		  		  cursor: pointer;
		  		  border-radius: 0px;
		  		  color: #62779c;
		  		  background: #fff;
		  		  font-weight: 600;
		  		  width: 80px;
		  		  font-size: 20px;
		  		  line-height: 40px;
		  		  text-align: center;
		  		  height: 40px;
		  		}
		
		.rgs-form /deep/ .el-upload .el-icon-plus {
		  		  border: 2px solid #62779c;
		  		  cursor: pointer;
		  		  border-radius: 0px;
		  		  color: #62779c;
		  		  background: #fff;
		  		  font-weight: 600;
		  		  width: 80px;
		  		  font-size: 20px;
		  		  line-height: 40px;
		  		  text-align: center;
		  		  height: 40px;
		  		}
	}
	.required {
		position: relative;
	}
	.required::after{
				color: red;
				position: absolute;
				right: 6px;
				content: "*";
				order: 1;
			}
	.editor>.avatar-uploader {
		line-height: 0;
		height: 0;
	}
</style>
