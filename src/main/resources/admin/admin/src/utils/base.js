const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot110s8rtj/",
            name: "springboot110s8rtj",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot110s8rtj/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于Spring Boot的百鲜农业过程化管理系统"
        } 
    }
}
export default base
