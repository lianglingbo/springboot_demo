/**
 * 初始化
 */
$(function(){
	//1.初始化table
	var oTable = new TableInit();
	oTable.Init();
	//2.初始化button的点击事件
	var oButtonInit = new ButtonInit();
	oButtonInit.Init();
});

var TableInit = function(){
	var oTableInit = new Object();
	//初始化Table
	oTableInit.Init = function(){
		//table 的id
		console.log("初始化Table");
		$("#tb_devices").bootstrapTable({
			url:'/api/selectN',
			method:'get',
			toolbar:'#toolbar',			//工具按钮容器
			striped:true,				//行间间隔色
			cache:false,				//是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
			pagination:false,			//分页显示
			sortable: true,            	//是否启用排序
			sortOrder:"asc",			//排序方式
			queryParams:oTableInit.queryParams,	//传递参数
			sidePagination: "client",           //分页方式：client客户端分页，server服务端分页（*）
			pageNumber:1,                       //初始化加载第一页，默认第一页
            pageSize: 10,                       //每页的记录行数（*）
            pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
            search: true,                       //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
            strictSearch: true,
            showColumns: true,                  //是否显示所有的列
            showRefresh: true,                  //是否显示刷新按钮
            minimumCountColumns: 2,             //最少允许的列数
            clickToSelect: true,                //是否启用点击选中行
            height: 500,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
            uniqueId: "ID",                     //每一行的唯一标识，一般为主键列
            showToggle:true,                    //是否显示详细视图和列表视图的切换按钮
            cardView: false,                    //是否显示详细视图
            detailView: false,                   //是否显示父子表
            
            /**
             * 
             */
            columns: [{
                checkbox: true
            }, {
                field: 'deviceId',
                title: '设备编号'
            }, {
                field: 'status',
                title: '状态'
            }, {
                field: 'province',
                title: '省'
            }, {
                field: 'city',
                title: '市'
            },{
                field: 'district',
                title: '区'
            } ]
		});
	};
	//得到查询的参数
	oTableInit.queryParams = function (params) {
//            limit: params.limit,   //页面大小
//            offset: params.offset,  //页码

        var deviceId = $("#txt_deviceId").val();
		var status = $("#txt_status").val();
		var temp = {};
		if(deviceId.length > 0){
			temp["deviceId"]=deviceId;
		}
		if(status.length > 0){
			temp["status"]=status;
		}
		console.log(temp);
        return temp;
    };
    return oTableInit;
};


	var ButtonInit = function () {
    var oInit = new Object();
    var postdata = {};

    oInit.Init = function () {
        //初始化页面上面的按钮事件
    	//按钮点击事件
    	$("#btn_query").click(function(){
    		  new TableInit();
    		  console.log("按钮点击事件");
    		 
    	});
    };

    return oInit;

};
	 