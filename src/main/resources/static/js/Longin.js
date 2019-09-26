function login(){
    var username = document.getElementById("ID").value;
    var password = document.getElementById("PASSWORD").value;
    if(username==""){
        alert("用户名不能为空！");
    }else if(password==""){
        alert("密码不能为空！");
    }else{
        AjaxFunc();
    }
}
function AjaxFunc()
{
    var username = document.getElementById("ID").value;
    var password = document.getElementById("PASSWORD").value;
    $.ajax({
        type: 'post',
        url: "/login.json",
        dataType: "json",
        contentType: "application/json;charset=UTF-8",
        data: JSON.stringify({"username": username,"password": password}),
        success: function (resp) {
            if (resp.success){
                location.href = "/zhuye.html"
                return;
            }else {
            alert("请输入正确的用户名和密码！")
                location.href ="/"
            }
        },

    });
}