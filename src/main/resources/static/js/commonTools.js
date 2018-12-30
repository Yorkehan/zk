layui.use(['laydate', 'laypage', 'layer', 'table', 'carousel', 'upload', 'element', 'slider'], function(){
    var laydate = layui.laydate //日期
        ,laypage = layui.laypage //分页
        ,layer = layui.layer //弹层
        ,table = layui.table //表格
        ,carousel = layui.carousel //轮播
        ,upload = layui.upload //上传
        ,element = layui.element //元素操作
        ,slider = layui.slider;//滑块
    window.renderDate=function(ID){
        laydate.render({
            elem: '#'+ID
        });
    };
    window.layeropen=function(URI,NAME) {
        var index = layer.open({
            title: name,
            type: 2,
            content: URI,
            area:['20%','90%'],
        });
    };



});

