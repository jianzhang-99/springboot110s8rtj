import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import nongchangfeiyong from '@/views/modules/nongchangfeiyong/list'
    import zhongzhihu from '@/views/modules/zhongzhihu/list'
    import yongpinruku from '@/views/modules/yongpinruku/list'
    import shujufenxiyuyouhua from '@/views/modules/shujufenxiyuyouhua/list'
    import shifeijiaoshui from '@/views/modules/shifeijiaoshui/list'
    import syslog from '@/views/modules/syslog/list'
    import shengzhangqingkuang from '@/views/modules/shengzhangqingkuang/list'
    import friendlink from '@/views/modules/friendlink/list'
    import nongzuowu from '@/views/modules/nongzuowu/list'
    import systemintro from '@/views/modules/systemintro/list'
    import zhiliangjiancehesuyuan from '@/views/modules/zhiliangjiancehesuyuan/list'
    import bingchonghaicuoshi from '@/views/modules/bingchonghaicuoshi/list'
    import zhongzhijihua from '@/views/modules/zhongzhijihua/list'
    import news from '@/views/modules/news/list'
    import aboutus from '@/views/modules/aboutus/list'
    import bingchonghaifangzhi from '@/views/modules/bingchonghaifangzhi/list'
    import zhongzhifeiyong from '@/views/modules/zhongzhifeiyong/list'
    import shebeiweihuqingkuang from '@/views/modules/shebeiweihuqingkuang/list'
    import shebeixinxi from '@/views/modules/shebeixinxi/list'
    import nongyejishuyuan from '@/views/modules/nongyejishuyuan/list'
    import tudi from '@/views/modules/tudi/list'
    import forum from '@/views/modules/forum/list'
    import zuowushiyingxingpinggu from '@/views/modules/zuowushiyingxingpinggu/list'
    import cangchu from '@/views/modules/cangchu/list'
    import chat from '@/views/modules/chat/list'
    import yongpinchuku from '@/views/modules/yongpinchuku/list'
    import nongchangzhu from '@/views/modules/nongchangzhu/list'
    import config from '@/views/modules/config/list'
    import newstype from '@/views/modules/newstype/list'


//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center', affix: true}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/nongchangfeiyong',
        name: '农场费用',
        component: nongchangfeiyong
      }
      ,{
	path: '/zhongzhihu',
        name: '种植户',
        component: zhongzhihu
      }
      ,{
	path: '/yongpinruku',
        name: '用品入库',
        component: yongpinruku
      }
      ,{
	path: '/shujufenxiyuyouhua',
        name: '数据分析与优化',
        component: shujufenxiyuyouhua
      }
      ,{
	path: '/shifeijiaoshui',
        name: '施肥浇水',
        component: shifeijiaoshui
      }
      ,{
	path: '/syslog',
        name: '系统日志',
        component: syslog
      }
      ,{
	path: '/shengzhangqingkuang',
        name: '生长情况',
        component: shengzhangqingkuang
      }
      ,{
	path: '/friendlink',
        name: '友情链接',
        component: friendlink
      }
      ,{
	path: '/nongzuowu',
        name: '农作物',
        component: nongzuowu
      }
      ,{
	path: '/systemintro',
        name: '系统简介',
        component: systemintro
      }
      ,{
	path: '/zhiliangjiancehesuyuan',
        name: '质量检测和溯源',
        component: zhiliangjiancehesuyuan
      }
      ,{
	path: '/bingchonghaicuoshi',
        name: '病虫害措施',
        component: bingchonghaicuoshi
      }
      ,{
	path: '/zhongzhijihua',
        name: '种植计划',
        component: zhongzhijihua
      }
      ,{
	path: '/news',
        name: '公告',
        component: news
      }
      ,{
	path: '/aboutus',
        name: '关于我们',
        component: aboutus
      }
      ,{
	path: '/bingchonghaifangzhi',
        name: '病虫害防治',
        component: bingchonghaifangzhi
      }
      ,{
	path: '/zhongzhifeiyong',
        name: '种植费用',
        component: zhongzhifeiyong
      }
      ,{
	path: '/shebeiweihuqingkuang',
        name: '设备维护情况',
        component: shebeiweihuqingkuang
      }
      ,{
	path: '/shebeixinxi',
        name: '设备信息',
        component: shebeixinxi
      }
      ,{
	path: '/nongyejishuyuan',
        name: '农业技术员',
        component: nongyejishuyuan
      }
      ,{
	path: '/tudi',
        name: '土地',
        component: tudi
      }
      ,{
	path: '/forum',
        name: '论坛',
        component: forum
      }
      ,{
	path: '/zuowushiyingxingpinggu',
        name: '作物适应性评估',
        component: zuowushiyingxingpinggu
      }
      ,{
	path: '/cangchu',
        name: '仓储',
        component: cangchu
      }
      ,{
	path: '/chat',
        name: '在线咨询',
        component: chat
      }
      ,{
	path: '/yongpinchuku',
        name: '用品出库',
        component: yongpinchuku
      }
      ,{
	path: '/nongchangzhu',
        name: '农场主',
        component: nongchangzhu
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/newstype',
        name: '公告分类',
        component: newstype
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
