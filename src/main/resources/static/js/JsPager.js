var k;
function change(e,all,zu){
    zz=zu;
    var pagesize=10;   //每页多少条信息
    pageall=all;     //总页数
    pageno=e;        //当前页
    if(e <1)//如果输入页<1页
    { e=1;pageno=1}//就等于第1页 ， 当前页为1
    if(e>pageall)//如果输入页大于最大页
    {e=pageall;pageno=pageall}//输入页和当前页都=最大页
    document.getElementById("tbody").innerHTML="";//全部清空
    for(var i=0;i<pagesize;i++)
    {
        var div =document.createElement("tr");//建立div对象
        div.innerHTML=zz[(e-1)*pagesize+i];//建立显示元素
        document.getElementById("tbody").appendChild(div);//加入tbody中
        if(zz[(e-1)*pagesize+i+1]==null)//超出范围跳出
            break
    }
    var ye="";
    for(var j=1;j<=pageall;j++)
    {
        if(e==j)
        {ye=ye+"<span><a href='#' onClick='change1("+j+")' style='color:#FF0000'>"+j+"</a></span> "}
        else
        {ye=ye+"<a href='#' onClick='change1("+j+")'>"+j+"</a> "}
    }
    document.getElementById("a1").innerHTML=pageall;
    document.getElementById("a2").innerHTML=pageno;
    document.getElementById("a3").innerHTML=ye;

    /*如果当前是第一页则：*/

    if (pageno == 1)
    {
        $('#down').hide();//隐藏
    }else {
        $('#down').show();//显示
    }

    /*如果是最后一页则：*/

    if (pageno == pageall)
    {
        $('#up').hide();//隐藏
    }else {
        $('#up').show();//显示
    }
    k=zu;

}
function change1(e){

    zz=k;

    var pagesize=10;
    pageall=$("#p").text();
    pageno=e;
    if(e <1)//如果输入页<1页
    { e=1;pageno=1}//就等于第1页 ， 当前页为1
    if(e>pageall)//如果输入页大于最大页
    {e=pageall;pageno=pageall}//输入页和当前页都=最大页
    document.getElementById("tbody").innerHTML="";//全部清空
    for(var i=0;i<pagesize;i++)
    {
        var div =document.createElement("tr");//建立div对象
        div.innerHTML=zz[(e-1)*pagesize+i];//建立显示元素
        document.getElementById("tbody").appendChild(div);//加入tbody中
        if(zz[(e-1)*pagesize+i+1]==null)//超出范围跳出
            break
    }
    var ye="";
    for(var j=1;j<=pageall;j++)
    {
        if(e==j)
        {ye=ye+"<span><a href='#' onClick='change1("+j+")' style='color:#FF0000'>"+j+"</a></span> "}
        else
        {ye=ye+"<a href='#' onClick='change1("+j+")'>"+j+"</a> "}
    }
    document.getElementById("a1").innerHTML=pageall;
    document.getElementById("a2").innerHTML=pageno;
    document.getElementById("a3").innerHTML=ye;

    /*如果当前是第一页则：*/

    if (pageno == 1)
    {
        $('#down').hide();//隐藏
    }else {
        $('#down').show();//显示
    }

    /*如果是最后一页则：*/

    if (pageno == pageall)
    {
        $('#up').hide();//隐藏
    }else {
        $('#up').show();//显示
    }
}