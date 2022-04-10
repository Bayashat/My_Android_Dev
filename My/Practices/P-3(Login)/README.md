由 4 个 Activity 组成: 
    * 1.activity_main 由
        1. 文本: --------WELCOME BACK--------
        2. 文本框: 左边带有 "email"图标的 "Email/ID Name"
        3. 文本框: 左边带有 "锁"图标的 "Password"
        4. Image Button : LOGIN

    2. activity_home_page : 背景 : 粉色
        1. FragmentContainerView : 背景是白色
        2. Button("HOME") : Onclick : gotoWelcomeFrag 方法
        3. Button("Profile") : Onclick : gotoProfileFrag 方法

    3. fragment_welcome :
        1. TextView : "Welcome to My Home page"

    4. fragment_profile : 
        1. TextView : "Name : Bayashat"
        1. TextView : "Gender : Male"
        1. TextView : "Email : bayashat2002@gmail.com"

映入眼帘的是 Activity_Main 界面 : 用户正确输入 ID Name: user01 和 Password: 123456  后切换到 HomePage 页面

HomePage Activity 里的 FragmentContainerView 默认接管的是 WelcomeFragment, 当按下 PROFILE Button 时 Container 切换到 ProfileFragment,若再按 HOME 则重新切换到 Welcome Fragment.



