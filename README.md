# AWL_WoNongYun
本地代码分享到github上

在github上新建readme.md文件

1、注解：黄油刀依赖添加ok、测试可用ok；但是生成注解的时候会自动导入包；*
黄油刀的使用要点：依赖配置、自动生成、绑定
2、Retrofit

    URL错误，不能正确请求：Call<PhoneResult> getResult(@Header("phone") String phone,@Query("dtype") String dtype,@Query("key") String apikey);
    URL正确，能正确请求Call<PhoneResult> getResult(@Query("phone") String phone,@Query("dtype") String dtype,@Query("") String apikey);
    //@Header和@Query区别，@Query("X")中的X一定要严格对应接口。
3、Glide 图片加载框架（不是裁剪框架）
4、Rxjava
5、MVVM
6、Databindin绑定
7、自定义控件
    主题栏*
8、项目的搭建
9、持续集成
10、全局变量（数据持久化）
11、接口、集合
12、回调

注：layout-land和layout-port，直接在在res右击选择新建android 源码文件夹，选择layout，直接写名字
layout-land和layout-port，经过实测运行满足想要条件。
