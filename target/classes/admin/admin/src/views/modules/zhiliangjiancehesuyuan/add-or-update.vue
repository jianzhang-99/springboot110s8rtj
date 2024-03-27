<template>
	<div class="addEdit-block" :style='{"padding":"0px 0px 30px","fontSize":"14px","color":"#000","background":"none"}'>
		<el-form
			:style='{"border":"0px solid rgba(255,255,255,1)","padding":"30px 0 10px","borderRadius":"0 0 8px 8px","alignItems":"flex-start","flexWrap":"wrap","background":"rgba(255,255,255,0)","display":"flex","fontSize":"inherit"}'
			class="add-update-preview"
			ref="ruleForm"
			:model="ruleForm"
			:rules="rules"
			label-width="150px"
		>
			<template >
				<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="input" v-if="type!='info'"  label="地块编号" prop="dikuaibianhao">
					<el-input v-model="ruleForm.dikuaibianhao" placeholder="地块编号" clearable  :readonly="ro.dikuaibianhao"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else class="input" label="地块编号" prop="dikuaibianhao">
					<el-input v-model="ruleForm.dikuaibianhao" placeholder="地块编号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="input" v-if="type!='info'"  label="种植面积(㎡)" prop="zhongzhimianji">
					<el-input v-model="ruleForm.zhongzhimianji" placeholder="种植面积(㎡)" clearable  :readonly="ro.zhongzhimianji"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else class="input" label="种植面积(㎡)" prop="zhongzhimianji">
					<el-input v-model="ruleForm.zhongzhimianji" placeholder="种植面积(㎡)" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="input" v-if="type!='info'"  label="农场主账号" prop="nongchangzhuzhanghao">
					<el-input v-model="ruleForm.nongchangzhuzhanghao" placeholder="农场主账号" clearable  :readonly="ro.nongchangzhuzhanghao"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else class="input" label="农场主账号" prop="nongchangzhuzhanghao">
					<el-input v-model="ruleForm.nongchangzhuzhanghao" placeholder="农场主账号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="input" v-if="type!='info'"  label="农场主" prop="nongchangzhu">
					<el-input v-model="ruleForm.nongchangzhu" placeholder="农场主" clearable  :readonly="ro.nongchangzhu"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else class="input" label="农场主" prop="nongchangzhu">
					<el-input v-model="ruleForm.nongchangzhu" placeholder="农场主" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="input" v-if="type!='info'"  label="作物名称" prop="zuowumingcheng">
					<el-input v-model="ruleForm.zuowumingcheng" placeholder="作物名称" clearable  :readonly="ro.zuowumingcheng"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else class="input" label="作物名称" prop="zuowumingcheng">
					<el-input v-model="ruleForm.zuowumingcheng" placeholder="作物名称" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="input" v-if="type!='info'"  label="种植户账号" prop="zhongzhihuzhanghao">
					<el-input v-model="ruleForm.zhongzhihuzhanghao" placeholder="种植户账号" clearable  :readonly="ro.zhongzhihuzhanghao"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else class="input" label="种植户账号" prop="zhongzhihuzhanghao">
					<el-input v-model="ruleForm.zhongzhihuzhanghao" placeholder="种植户账号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="input" v-if="type!='info'"  label="种植户" prop="zhongzhihu">
					<el-input v-model="ruleForm.zhongzhihu" placeholder="种植户" clearable  :readonly="ro.zhongzhihu"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else class="input" label="种植户" prop="zhongzhihu">
					<el-input v-model="ruleForm.zhongzhihu" placeholder="种植户" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="input" v-if="type!='info'"  label="技术员账号" prop="jishuyuanzhanghao">
					<el-input v-model="ruleForm.jishuyuanzhanghao" placeholder="技术员账号" clearable  :readonly="ro.jishuyuanzhanghao"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else class="input" label="技术员账号" prop="jishuyuanzhanghao">
					<el-input v-model="ruleForm.jishuyuanzhanghao" placeholder="技术员账号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="input" v-if="type!='info'"  label="技术员" prop="jishuyuan">
					<el-input v-model="ruleForm.jishuyuan" placeholder="技术员" clearable  :readonly="ro.jishuyuan"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else class="input" label="技术员" prop="jishuyuan">
					<el-input v-model="ruleForm.jishuyuan" placeholder="技术员" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="input" v-if="type!='info'"  label="技术员手机" prop="jishuyuanshouji">
					<el-input v-model="ruleForm.jishuyuanshouji" placeholder="技术员手机" clearable  :readonly="ro.jishuyuanshouji"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else class="input" label="技术员手机" prop="jishuyuanshouji">
					<el-input v-model="ruleForm.jishuyuanshouji" placeholder="技术员手机" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="input" v-if="type!='info'"  label="检测项目" prop="jiancexiangmu">
					<el-input v-model="ruleForm.jiancexiangmu" placeholder="检测项目" clearable  :readonly="ro.jiancexiangmu"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else class="input" label="检测项目" prop="jiancexiangmu">
					<el-input v-model="ruleForm.jiancexiangmu" placeholder="检测项目" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="select" v-if="type!='info'"  label="检测结果" prop="jiancejieguo">
					<el-select :disabled="ro.jiancejieguo" v-model="ruleForm.jiancejieguo" placeholder="请选择检测结果" >
						<el-option
							v-for="(item,index) in jiancejieguoOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else class="input" label="检测结果" prop="jiancejieguo">
					<el-input v-model="ruleForm.jiancejieguo"
						placeholder="检测结果" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="upload" v-if="type!='info' && !ro.suyuanma" label="溯源码" prop="suyuanma">
					<file-upload
						tip="点击上传溯源码"
						action="file/upload"
						:limit="3"
						:multiple="true"
						:fileUrls="ruleForm.suyuanma?ruleForm.suyuanma:''"
						@change="suyuanmaUploadChange"
					></file-upload>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="upload" v-else-if="ruleForm.suyuanma" label="溯源码" prop="suyuanma">
					<img v-if="ruleForm.suyuanma.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.suyuanma.split(',')[0]" width="100" height="100">
					<img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.suyuanma.split(',')" :src="$base.url+item" width="100" height="100">
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="input" v-if="type!='info'"  label="认证机构" prop="renzhengjigou">
					<el-input v-model="ruleForm.renzhengjigou" placeholder="认证机构" clearable  :readonly="ro.renzhengjigou"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else class="input" label="认证机构" prop="renzhengjigou">
					<el-input v-model="ruleForm.renzhengjigou" placeholder="认证机构" readonly></el-input>
				</el-form-item>
			</template>
				<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-if="type!='info'"  label="检测报告" prop="jiancebaogao">
					<editor 
						style="min-width: 200px; max-width: 600px;"
						v-model="ruleForm.jiancebaogao" 
						class="editor" 
						action="file/upload">
					</editor>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else-if="ruleForm.jiancebaogao" label="检测报告" prop="jiancebaogao">
                    <span :style='{"padding":"0 20px","color":"inherit","background":"#fff","display":"inline-block","width":"80%","fontSize":"14px","lineHeight":"40px","fontWeight":"500"}' v-html="ruleForm.jiancebaogao"></span>
                </el-form-item>
			<el-form-item :style='{"padding":"0 10px","margin":"30px 0","alignItems":"center","textAlign":"center","display":"flex","width":"100%","perspective":"320px","-webkitPerspective":"320px","fontSize":"48px","justifyContent":"flex-end"}' class="btn">
				<el-button class="btn3"  v-if="type!='info'" type="success" @click="onSubmit">
					<span class="icon iconfont icon-tijiao16" :style='{"margin":"0 2px","fontSize":"18px","color":"inherit","display":"none"}'></span>
					提交
				</el-button>
				<el-button class="btn4" v-if="type!='info'" type="success" @click="back()">
					<span class="icon iconfont icon-quxiao09" :style='{"margin":"0 2px","fontSize":"18px","color":"inherit","display":"none"}'></span>
					取消
				</el-button>
				<el-button class="btn5" v-if="type=='info'" type="success" @click="back()">
					<span class="icon iconfont icon-fanhui01" :style='{"margin":"0 2px","fontSize":"18px","color":"inherit","display":"none"}'></span>
					返回
				</el-button>
			</el-form-item>
		</el-form>
    

  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
	data() {
		let self = this
		var validateIdCard = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!checkIdCard(value)) {
				callback(new Error("请输入正确的身份证号码"));
			} else {
				callback();
			}
		};
		var validateUrl = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isURL(value)) {
				callback(new Error("请输入正确的URL地址"));
			} else {
				callback();
			}
		};
		var validateMobile = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isMobile(value)) {
				callback(new Error("请输入正确的手机号码"));
			} else {
				callback();
			}
		};
		var validatePhone = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isPhone(value)) {
				callback(new Error("请输入正确的电话号码"));
			} else {
				callback();
			}
		};
		var validateEmail = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isEmail(value)) {
				callback(new Error("请输入正确的邮箱地址"));
			} else {
				callback();
			}
		};
		var validateNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isNumber(value)) {
				callback(new Error("请输入数字"));
			} else {
				callback();
			}
		};
		var validateIntNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isIntNumer(value)) {
				callback(new Error("请输入整数"));
			} else {
				callback();
			}
		};
		return {
			id: '',
			type: '',
			
			
			ro:{
				dikuaibianhao : false,
				zhongzhimianji : false,
				nongchangzhuzhanghao : false,
				nongchangzhu : false,
				zuowumingcheng : false,
				zhongzhihuzhanghao : false,
				zhongzhihu : false,
				jishuyuanzhanghao : false,
				jishuyuan : false,
				jishuyuanshouji : false,
				jiancexiangmu : false,
				jiancejieguo : false,
				suyuanma : false,
				renzhengjigou : false,
				jiancebaogao : false,
			},
			
			
			ruleForm: {
				dikuaibianhao: '',
				zhongzhimianji: '',
				nongchangzhuzhanghao: '',
				nongchangzhu: '',
				zuowumingcheng: '',
				zhongzhihuzhanghao: '',
				zhongzhihu: '',
				jishuyuanzhanghao: '',
				jishuyuan: '',
				jishuyuanshouji: '',
				jiancexiangmu: '',
				jiancejieguo: '',
				suyuanma: '',
				renzhengjigou: '',
				jiancebaogao: '',
			},
		
			jiancejieguoOptions: [],

			
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
				jishuyuanzhanghao: [
				],
				jishuyuan: [
				],
				jishuyuanshouji: [
				],
				jiancexiangmu: [
					{ required: true, message: '检测项目不能为空', trigger: 'blur' },
				],
				jiancejieguo: [
					{ required: true, message: '检测结果不能为空', trigger: 'blur' },
				],
				suyuanma: [
				],
				renzhengjigou: [
					{ required: true, message: '认证机构不能为空', trigger: 'blur' },
				],
				jiancebaogao: [
				],
			}
		};
	},
	props: ["parent"],
	computed: {



	},
    components: {
    },
	created() {
	},
	methods: {
		
		// 下载
		download(file){
			window.open(`${file}`)
		},
		// 初始化
		init(id,type) {
			if (id) {
				this.id = id;
				this.type = type;
			}
			if(this.type=='info'||this.type=='else'){
				this.info(id);
			}else if(this.type=='logistics'){
				this.logistics=false;
				this.info(id);
			}else if(this.type=='cross'){
				var obj = this.$storage.getObj('crossObj');
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
						if(o=='jishuyuanzhanghao'){
							this.ruleForm.jishuyuanzhanghao = obj[o];
							this.ro.jishuyuanzhanghao = true;
							continue;
						}
						if(o=='jishuyuan'){
							this.ruleForm.jishuyuan = obj[o];
							this.ro.jishuyuan = true;
							continue;
						}
						if(o=='jishuyuanshouji'){
							this.ruleForm.jishuyuanshouji = obj[o];
							this.ro.jishuyuanshouji = true;
							continue;
						}
						if(o=='jiancexiangmu'){
							this.ruleForm.jiancexiangmu = obj[o];
							this.ro.jiancexiangmu = true;
							continue;
						}
						if(o=='jiancejieguo'){
							this.ruleForm.jiancejieguo = obj[o];
							this.ro.jiancejieguo = true;
							continue;
						}
						if(o=='suyuanma'){
							this.ruleForm.suyuanma = obj[o];
							this.ro.suyuanma = true;
							continue;
						}
						if(o=='renzhengjigou'){
							this.ruleForm.renzhengjigou = obj[o];
							this.ro.renzhengjigou = true;
							continue;
						}
						if(o=='jiancebaogao'){
							this.ruleForm.jiancebaogao = obj[o];
							this.ro.jiancebaogao = true;
							continue;
						}
				}
				















			}
			
			// 获取用户信息
			this.$http({
				url: `${this.$storage.get('sessionTable')}/session`,
				method: "get"
			}).then(({ data }) => {
				if (data && data.code === 0) {
					
					var json = data.data;
					if(((json.jishuyuanzhanghao!=''&&json.jishuyuanzhanghao) || json.jishuyuanzhanghao==0) && this.$storage.get("role")!="管理员"){
						this.ruleForm.jishuyuanzhanghao = json.jishuyuanzhanghao
						this.ro.jishuyuanzhanghao = true;
					}
					if(((json.jishuyuan!=''&&json.jishuyuan) || json.jishuyuan==0) && this.$storage.get("role")!="管理员"){
						this.ruleForm.jishuyuan = json.jishuyuan
						this.ro.jishuyuan = true;
					}
					if(((json.jishuyuanshouji!=''&&json.jishuyuanshouji) || json.jishuyuanshouji==0) && this.$storage.get("role")!="管理员"){
						this.ruleForm.jishuyuanshouji = json.jishuyuanshouji
						this.ro.jishuyuanshouji = true;
					}
				} else {
					this.$message.error(data.msg);
				}
			});
			
            this.jiancejieguoOptions = "正常,异常".split(',')
			
		},
    // 多级联动参数

    info(id) {
      this.$http({
        url: `zhiliangjiancehesuyuan/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
        //解决前台上传图片后台不显示的问题
        let reg=new RegExp('../../../upload','g')//g代表全部
        this.ruleForm.jiancebaogao = this.ruleForm.jiancebaogao.replace(reg,'../../../springboot110s8rtj/upload');
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {













	if(this.ruleForm.suyuanma!=null) {
		this.ruleForm.suyuanma = this.ruleForm.suyuanma.replace(new RegExp(this.$base.url,"g"),"");
	}



var objcross = this.$storage.getObj('crossObj');

      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(statusColumnName && !statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
       this.$refs["ruleForm"].validate(valid => {
         if (valid) {
		 if(crossrefid && crossuserid) {
			 this.ruleForm.crossuserid = crossuserid;
			 this.ruleForm.crossrefid = crossrefid;
			let params = { 
				page: 1, 
				limit: 10, 
				crossuserid:this.ruleForm.crossuserid,
				crossrefid:this.ruleForm.crossrefid,
			} 
			this.$http({ 
				url: "zhiliangjiancehesuyuan/page", 
				method: "get", 
				params: params 
			}).then(({ 
				data 
			}) => { 
				if (data && data.code === 0) { 
				       if(data.data.total>=crossoptnum) {
					     this.$message.error(this.$storage.get('tips'));
					       return false;
				       } else {
					 this.$http({
					   url: `zhiliangjiancehesuyuan/${!this.ruleForm.id ? "save" : "update"}`,
					   method: "post",
					   data: this.ruleForm
					 }).then(({ data }) => {
					   if (data && data.code === 0) {
					     this.$message({
					       message: "操作成功",
					       type: "success",
					       duration: 1500,
					       onClose: () => {
						 this.parent.showFlag = true;
						 this.parent.addOrUpdateFlag = false;
						 this.parent.zhiliangjiancehesuyuanCrossAddOrUpdateFlag = false;
						 this.parent.search();
						 this.parent.contentStyleChange();
					       }
					     });
					   } else {
					     this.$message.error(data.msg);
					   }
					 });

				       }
				} else { 
				} 
			});
		 } else {
			 this.$http({
			   url: `zhiliangjiancehesuyuan/${!this.ruleForm.id ? "save" : "update"}`,
			   method: "post",
			   data: this.ruleForm
			 }).then(({ data }) => {
			   if (data && data.code === 0) {
			     this.$message({
			       message: "操作成功",
			       type: "success",
			       duration: 1500,
			       onClose: () => {
				 this.parent.showFlag = true;
				 this.parent.addOrUpdateFlag = false;
				 this.parent.zhiliangjiancehesuyuanCrossAddOrUpdateFlag = false;
				 this.parent.search();
				 this.parent.contentStyleChange();
			       }
			     });
			   } else {
			     this.$message.error(data.msg);
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
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.zhiliangjiancehesuyuanCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
    suyuanmaUploadChange(fileUrls) {
	    this.ruleForm.suyuanma = fileUrls;
    },
  }
};
</script>
<style lang="scss" scoped>
	.amap-wrapper {
		width: 100%;
		height: 500px;
	}
	
	.search-box {
		position: absolute;
	}
	
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
	.add-update-preview .el-input-number /deep/ .el-input__inner {
		text-align: left;
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
	.add-update-preview .el-input-number /deep/ .el-input-number__decrease {
		display: none;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__increase {
		display: none;
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
	
	.add-update-preview /deep/ .upload .upload-img {
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
	
	.add-update-preview .btn .btn1 {
				border: 0px solid rgba(126, 96, 16, .2);
				cursor: pointer;
				padding: 0 30px;
				margin: 0px 20px 0 0;
				color: #fff;
				display: inline-block;
				font-size: 14px;
				line-height: 24px;
				border-radius: 4px;
				outline: none;
				background: #62779c;
				width: auto;
				height: 40px;
			}
	
	.add-update-preview .btn .btn1:hover {
				transform: scale(0.9);
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn2 {
				border: 0px solid rgba(126, 96, 16, .2);
				cursor: pointer;
				border-radius: 4px;
				padding: 0 30px;
				margin: 0px 20px 0 0;
				outline: none;
				color: #fff;
				background: #62779c;
				width: auto;
				font-size: 14px;
				line-height: 24px;
				height: 40px;
			}
	
	.add-update-preview .btn .btn2:hover {
				transform: scale(0.9);
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn3 {
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
	
	.add-update-preview .btn .btn3:hover {
				transform: scale(0.9);
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn4 {
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
	
	.add-update-preview .btn .btn4:hover {
				transform: scale(0.9);
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn5 {
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
	
	.add-update-preview .btn .btn5:hover {
				transform: scale(0.9);
				opacity: 0.8;
			}
</style>
