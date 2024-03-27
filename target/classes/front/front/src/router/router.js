import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Forum from '../pages/forum/list'
import ForumAdd from '../pages/forum/add'
import ForumDetail from '../pages/forum/detail'
import MyForumList from '../pages/forum/myForumList'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import nongyejishuyuanList from '../pages/nongyejishuyuan/list'
import nongyejishuyuanDetail from '../pages/nongyejishuyuan/detail'
import nongyejishuyuanAdd from '../pages/nongyejishuyuan/add'
import zhongzhihuList from '../pages/zhongzhihu/list'
import zhongzhihuDetail from '../pages/zhongzhihu/detail'
import zhongzhihuAdd from '../pages/zhongzhihu/add'
import nongchangzhuList from '../pages/nongchangzhu/list'
import nongchangzhuDetail from '../pages/nongchangzhu/detail'
import nongchangzhuAdd from '../pages/nongchangzhu/add'
import tudiList from '../pages/tudi/list'
import tudiDetail from '../pages/tudi/detail'
import tudiAdd from '../pages/tudi/add'
import nongzuowuList from '../pages/nongzuowu/list'
import nongzuowuDetail from '../pages/nongzuowu/detail'
import nongzuowuAdd from '../pages/nongzuowu/add'
import shengzhangqingkuangList from '../pages/shengzhangqingkuang/list'
import shengzhangqingkuangDetail from '../pages/shengzhangqingkuang/detail'
import shengzhangqingkuangAdd from '../pages/shengzhangqingkuang/add'
import bingchonghaifangzhiList from '../pages/bingchonghaifangzhi/list'
import bingchonghaifangzhiDetail from '../pages/bingchonghaifangzhi/detail'
import bingchonghaifangzhiAdd from '../pages/bingchonghaifangzhi/add'
import shifeijiaoshuiList from '../pages/shifeijiaoshui/list'
import shifeijiaoshuiDetail from '../pages/shifeijiaoshui/detail'
import shifeijiaoshuiAdd from '../pages/shifeijiaoshui/add'
import zhongzhifeiyongList from '../pages/zhongzhifeiyong/list'
import zhongzhifeiyongDetail from '../pages/zhongzhifeiyong/detail'
import zhongzhifeiyongAdd from '../pages/zhongzhifeiyong/add'
import zhongzhijihuaList from '../pages/zhongzhijihua/list'
import zhongzhijihuaDetail from '../pages/zhongzhijihua/detail'
import zhongzhijihuaAdd from '../pages/zhongzhijihua/add'
import zhiliangjiancehesuyuanList from '../pages/zhiliangjiancehesuyuan/list'
import zhiliangjiancehesuyuanDetail from '../pages/zhiliangjiancehesuyuan/detail'
import zhiliangjiancehesuyuanAdd from '../pages/zhiliangjiancehesuyuan/add'
import bingchonghaicuoshiList from '../pages/bingchonghaicuoshi/list'
import bingchonghaicuoshiDetail from '../pages/bingchonghaicuoshi/detail'
import bingchonghaicuoshiAdd from '../pages/bingchonghaicuoshi/add'
import zuowushiyingxingpingguList from '../pages/zuowushiyingxingpinggu/list'
import zuowushiyingxingpingguDetail from '../pages/zuowushiyingxingpinggu/detail'
import zuowushiyingxingpingguAdd from '../pages/zuowushiyingxingpinggu/add'
import nongchangfeiyongList from '../pages/nongchangfeiyong/list'
import nongchangfeiyongDetail from '../pages/nongchangfeiyong/detail'
import nongchangfeiyongAdd from '../pages/nongchangfeiyong/add'
import shebeixinxiList from '../pages/shebeixinxi/list'
import shebeixinxiDetail from '../pages/shebeixinxi/detail'
import shebeixinxiAdd from '../pages/shebeixinxi/add'
import shebeiweihuqingkuangList from '../pages/shebeiweihuqingkuang/list'
import shebeiweihuqingkuangDetail from '../pages/shebeiweihuqingkuang/detail'
import shebeiweihuqingkuangAdd from '../pages/shebeiweihuqingkuang/add'
import cangchuList from '../pages/cangchu/list'
import cangchuDetail from '../pages/cangchu/detail'
import cangchuAdd from '../pages/cangchu/add'
import yongpinrukuList from '../pages/yongpinruku/list'
import yongpinrukuDetail from '../pages/yongpinruku/detail'
import yongpinrukuAdd from '../pages/yongpinruku/add'
import yongpinchukuList from '../pages/yongpinchuku/list'
import yongpinchukuDetail from '../pages/yongpinchuku/detail'
import yongpinchukuAdd from '../pages/yongpinchuku/add'
import shujufenxiyuyouhuaList from '../pages/shujufenxiyuyouhua/list'
import shujufenxiyuyouhuaDetail from '../pages/shujufenxiyuyouhua/detail'
import shujufenxiyuyouhuaAdd from '../pages/shujufenxiyuyouhua/add'
import chatmessageList from '../pages/chatmessage/list'
import chatmessageDetail from '../pages/chatmessage/detail'
import chatmessageAdd from '../pages/chatmessage/add'
import friendList from '../pages/friend/list'
import friendDetail from '../pages/friend/detail'
import friendAdd from '../pages/friend/add'
import syslogList from '../pages/syslog/list'
import syslogDetail from '../pages/syslog/detail'
import syslogAdd from '../pages/syslog/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'
import aboutusList from '../pages/aboutus/list'
import aboutusDetail from '../pages/aboutus/detail'
import aboutusAdd from '../pages/aboutus/add'
import systemintroList from '../pages/systemintro/list'
import systemintroDetail from '../pages/systemintro/detail'
import systemintroAdd from '../pages/systemintro/add'
import friendlinkList from '../pages/friendlink/list'
import friendlinkDetail from '../pages/friendlink/detail'
import friendlinkAdd from '../pages/friendlink/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'forum',
					component: Forum
				},
				{
					path: 'forumAdd',
					component: ForumAdd
				},
				{
					path: 'forumDetail',
					component: ForumDetail
				},
				{
					path: 'myForumList',
					component: MyForumList
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'nongyejishuyuan',
					component: nongyejishuyuanList
				},
				{
					path: 'nongyejishuyuanDetail',
					component: nongyejishuyuanDetail
				},
				{
					path: 'nongyejishuyuanAdd',
					component: nongyejishuyuanAdd
				},
				{
					path: 'zhongzhihu',
					component: zhongzhihuList
				},
				{
					path: 'zhongzhihuDetail',
					component: zhongzhihuDetail
				},
				{
					path: 'zhongzhihuAdd',
					component: zhongzhihuAdd
				},
				{
					path: 'nongchangzhu',
					component: nongchangzhuList
				},
				{
					path: 'nongchangzhuDetail',
					component: nongchangzhuDetail
				},
				{
					path: 'nongchangzhuAdd',
					component: nongchangzhuAdd
				},
				{
					path: 'tudi',
					component: tudiList
				},
				{
					path: 'tudiDetail',
					component: tudiDetail
				},
				{
					path: 'tudiAdd',
					component: tudiAdd
				},
				{
					path: 'nongzuowu',
					component: nongzuowuList
				},
				{
					path: 'nongzuowuDetail',
					component: nongzuowuDetail
				},
				{
					path: 'nongzuowuAdd',
					component: nongzuowuAdd
				},
				{
					path: 'shengzhangqingkuang',
					component: shengzhangqingkuangList
				},
				{
					path: 'shengzhangqingkuangDetail',
					component: shengzhangqingkuangDetail
				},
				{
					path: 'shengzhangqingkuangAdd',
					component: shengzhangqingkuangAdd
				},
				{
					path: 'bingchonghaifangzhi',
					component: bingchonghaifangzhiList
				},
				{
					path: 'bingchonghaifangzhiDetail',
					component: bingchonghaifangzhiDetail
				},
				{
					path: 'bingchonghaifangzhiAdd',
					component: bingchonghaifangzhiAdd
				},
				{
					path: 'shifeijiaoshui',
					component: shifeijiaoshuiList
				},
				{
					path: 'shifeijiaoshuiDetail',
					component: shifeijiaoshuiDetail
				},
				{
					path: 'shifeijiaoshuiAdd',
					component: shifeijiaoshuiAdd
				},
				{
					path: 'zhongzhifeiyong',
					component: zhongzhifeiyongList
				},
				{
					path: 'zhongzhifeiyongDetail',
					component: zhongzhifeiyongDetail
				},
				{
					path: 'zhongzhifeiyongAdd',
					component: zhongzhifeiyongAdd
				},
				{
					path: 'zhongzhijihua',
					component: zhongzhijihuaList
				},
				{
					path: 'zhongzhijihuaDetail',
					component: zhongzhijihuaDetail
				},
				{
					path: 'zhongzhijihuaAdd',
					component: zhongzhijihuaAdd
				},
				{
					path: 'zhiliangjiancehesuyuan',
					component: zhiliangjiancehesuyuanList
				},
				{
					path: 'zhiliangjiancehesuyuanDetail',
					component: zhiliangjiancehesuyuanDetail
				},
				{
					path: 'zhiliangjiancehesuyuanAdd',
					component: zhiliangjiancehesuyuanAdd
				},
				{
					path: 'bingchonghaicuoshi',
					component: bingchonghaicuoshiList
				},
				{
					path: 'bingchonghaicuoshiDetail',
					component: bingchonghaicuoshiDetail
				},
				{
					path: 'bingchonghaicuoshiAdd',
					component: bingchonghaicuoshiAdd
				},
				{
					path: 'zuowushiyingxingpinggu',
					component: zuowushiyingxingpingguList
				},
				{
					path: 'zuowushiyingxingpingguDetail',
					component: zuowushiyingxingpingguDetail
				},
				{
					path: 'zuowushiyingxingpingguAdd',
					component: zuowushiyingxingpingguAdd
				},
				{
					path: 'nongchangfeiyong',
					component: nongchangfeiyongList
				},
				{
					path: 'nongchangfeiyongDetail',
					component: nongchangfeiyongDetail
				},
				{
					path: 'nongchangfeiyongAdd',
					component: nongchangfeiyongAdd
				},
				{
					path: 'shebeixinxi',
					component: shebeixinxiList
				},
				{
					path: 'shebeixinxiDetail',
					component: shebeixinxiDetail
				},
				{
					path: 'shebeixinxiAdd',
					component: shebeixinxiAdd
				},
				{
					path: 'shebeiweihuqingkuang',
					component: shebeiweihuqingkuangList
				},
				{
					path: 'shebeiweihuqingkuangDetail',
					component: shebeiweihuqingkuangDetail
				},
				{
					path: 'shebeiweihuqingkuangAdd',
					component: shebeiweihuqingkuangAdd
				},
				{
					path: 'cangchu',
					component: cangchuList
				},
				{
					path: 'cangchuDetail',
					component: cangchuDetail
				},
				{
					path: 'cangchuAdd',
					component: cangchuAdd
				},
				{
					path: 'yongpinruku',
					component: yongpinrukuList
				},
				{
					path: 'yongpinrukuDetail',
					component: yongpinrukuDetail
				},
				{
					path: 'yongpinrukuAdd',
					component: yongpinrukuAdd
				},
				{
					path: 'yongpinchuku',
					component: yongpinchukuList
				},
				{
					path: 'yongpinchukuDetail',
					component: yongpinchukuDetail
				},
				{
					path: 'yongpinchukuAdd',
					component: yongpinchukuAdd
				},
				{
					path: 'shujufenxiyuyouhua',
					component: shujufenxiyuyouhuaList
				},
				{
					path: 'shujufenxiyuyouhuaDetail',
					component: shujufenxiyuyouhuaDetail
				},
				{
					path: 'shujufenxiyuyouhuaAdd',
					component: shujufenxiyuyouhuaAdd
				},
				{
					path: 'chatmessage',
					component: chatmessageList
				},
				{
					path: 'chatmessageDetail',
					component: chatmessageDetail
				},
				{
					path: 'chatmessageAdd',
					component: chatmessageAdd
				},
				{
					path: 'friend',
					component: friendList
				},
				{
					path: 'friendDetail',
					component: friendDetail
				},
				{
					path: 'friendAdd',
					component: friendAdd
				},
				{
					path: 'syslog',
					component: syslogList
				},
				{
					path: 'syslogDetail',
					component: syslogDetail
				},
				{
					path: 'syslogAdd',
					component: syslogAdd
				},
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
				},
				{
					path: 'aboutus',
					component: aboutusList
				},
				{
					path: 'aboutusDetail',
					component: aboutusDetail
				},
				{
					path: 'aboutusAdd',
					component: aboutusAdd
				},
				{
					path: 'systemintro',
					component: systemintroList
				},
				{
					path: 'systemintroDetail',
					component: systemintroDetail
				},
				{
					path: 'systemintroAdd',
					component: systemintroAdd
				},
				{
					path: 'friendlink',
					component: friendlinkList
				},
				{
					path: 'friendlinkDetail',
					component: friendlinkDetail
				},
				{
					path: 'friendlinkAdd',
					component: friendlinkAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
