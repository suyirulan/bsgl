<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>

</body>



<script>
	var resizefunc = [];
</script>
<!-- jQuery  -->
<script src="${basePath}/assets/js/jquery.min.js"></script>
<script src="${basePath}/assets/js/bootstrap.min.js"></script>
<script src="${basePath}/assets/js/detect.js"></script>
<script src="${basePath}/assets/js/fastclick.js"></script>
<script src="${basePath}/assets/js/jquery.slimscroll.js"></script>
<script src="${basePath}/assets/js/jquery.blockUI.js"></script>
<script src="${basePath}/assets/js/waves.js"></script>
<script src="${basePath}/assets/js/wow.min.js"></script>
<script src="${basePath}/assets/js/jquery.nicescroll.js"></script>
<script src="${basePath}/assets/js/jquery.scrollTo.min.js"></script>

<!-- Datatables-->
<script src="${basePath}/assets/plugins/datatables/jquery.dataTables.min.js"></script>
<script src="${basePath}/assets/plugins/datatables/dataTables.bootstrap.js"></script>
<script src="${basePath}/assets/plugins/datatables/dataTables.buttons.min.js"></script>
<script src="${basePath}/assets/plugins/datatables/buttons.bootstrap.min.js"></script>
<script src="${basePath}/assets/plugins/datatables/jszip.min.js"></script>
<script src="${basePath}/assets/plugins/datatables/pdfmake.min.js"></script>
<script src="${basePath}/assets/plugins/datatables/vfs_fonts.js"></script>
<script src="${basePath}/assets/plugins/datatables/buttons.html5.min.js"></script>
<script src="${basePath}/assets/plugins/datatables/buttons.print.min.js"></script>
<script src="${basePath}/assets/plugins/datatables/dataTables.fixedHeader.min.js"></script>
<script src="${basePath}/assets/plugins/datatables/dataTables.keyTable.min.js"></script>
<script src="${basePath}/assets/plugins/datatables/dataTables.responsive.min.js"></script>
<script src="${basePath}/assets/plugins/datatables/responsive.bootstrap.min.js"></script>
<script src="${basePath}/assets/plugins/datatables/dataTables.scroller.min.js"></script>

<!-- Modal-Effect -->
<script src="${basePath}/assets/plugins/modal-effect/js/classie.js"></script>
<script src="${basePath}/assets/plugins/modal-effect/js/modalEffects.js"></script>

<!-- Datatable init js -->
<script src="${basePath}/assets/pages/datatables.init.js"></script>
<script src="${basePath}/assets/js/jquery.app.js"></script>

<!-- jquery init js -->

<!-- Page Specific JS Libraries -->
<script src="${basePath}/assets/plugins/dropzone/dist/dropzone.js"></script>
<script src="${basePath}/assets/plugins/toggles/toggles.min.js"></script>




<script src="/signmanage/assets/js/select2.full.js" type="text/javascript"></script>
<script src="/signmanage/assets/js/jquery-form.js"></script>
<script src="/signmanage/assets/plugins/notifyjs/dist/notify.min.js"></script>
<script src="/signmanage/assets/plugins/notifications/notify-metro.js"></script>
<script src="/signmanage/assets/plugins/notifications/notifications.js"></script>

<script type="text/javascript">
function DataLoad(){
	$.post("/signmanage/Sign/getfSignangeData",{signid:"${baseInput.reqNo}" },function(data){
		debugger;
		var jsondata=eval("("+data+")");

		var fSignange=jsondata.data.fSignange;
		var fKksSignange=jsondata.data.fKksSignange;
		var fConduitSignange=jsondata.data.fConduitSignange;
		var fIsolationSignange=jsondata.data.fIsolationSignange;


		var def={};
		if(fSignange.signtype=="A" )
		{
			var tdata=$.extend(def, fSignange,fKksSignange);
			KKSDataInit(tdata);
		}else if(fSignange.signtype=="B")
		{
			var tdata=$.extend(def, fSignange,fKksSignange);
			RoomDataInit(tdata);
		}
		else if(fSignange.signtype=="C")
		{
			var tdata=$.extend(def, fSignange,fIsolationSignange);
			IsolationDataInit(tdata);
		}else
		{
			var tdata=$.extend(def, fSignange,fConduitSignange);
			ConduitDataInit(tdata);
		}
	});
}


function KKSDataInit(data){

	$("#RoomSignForm").find("#GID").val(data.gid);
	$("#RoomSignForm").find("#SIGNID").val(data.signid);
	$("#RoomSignForm").find("input[name=SIGNANGE_CONTENT]").val(data.signangeContent);
	$("#RoomSignForm").find("select[name=DEFECTTYPE]").val(data.defecttype);
	$("#RoomSignForm").find("input[name=LENGTH]").val(data.length);
	$("#RoomSignForm").find("input[name=WIDTH]").val(data.width);
	$("#RoomSignForm").find("select[name=MATERIAL]").val(data.material);
	$("#RoomSignForm").find("select[name=COLOR]").val(data.color);
	$("#RoomSignForm").find("input[name=O_COLOR]").val(data.oColor);
	$("#RoomSignForm").find("input[name=S_COUNT]").val(data.sCount);
	$("#RoomSignForm").find("select[name=LIABILITY_Z]").val(data.liabilityZ);
	$("#RoomSignForm").find("select[name=LIABILITY_Q]").val(data.liabilityQ);
	$("#RoomSignForm").find("textarea[name=REMARK]").val(data.remark);
}

function RoomDataInit(data){

	$("#RoomSignForm").find("#GID").val(data.gid);
	$("#RoomSignForm").find("#SIGNID").val(data.signid);
	$("#RoomSignForm").find("input[name=SIGNANGE_CONTENT]").val(data.signangeContent);
	$("#RoomSignForm").find("select[name=DEFECTTYPE]").val(data.defecttype);
	$("#RoomSignForm").find("input[name=LENGTH]").val(data.length);
	$("#RoomSignForm").find("input[name=WIDTH]").val(data.width);
	$("#RoomSignForm").find("select[name=MATERIAL]").val(data.material);
	$("#RoomSignForm").find("select[name=COLOR]").val(data.color);
	$("#RoomSignForm").find("input[name=O_COLOR]").val(data.oColor);
	$("#RoomSignForm").find("input[name=S_COUNT]").val(data.sCount);
	$("#RoomSignForm").find("select[name=LIABILITY_Z]").val(data.liabilityZ);
	$("#RoomSignForm").find("select[name=LIABILITY_Q]").val(data.liabilityQ);
	$("#RoomSignForm").find("textarea[name=REMARK]").val(data.remark);
}

function IsolationDataInit(data){

	$("#RoomSignForm").find("#GID").val(data.gid);
	$("#RoomSignForm").find("#SIGNID").val(data.signid);
	$("#RoomSignForm").find("input[name=SIGNANGE_CONTENT]").val(data.signangeContent);
	$("#RoomSignForm").find("select[name=DEFECTTYPE]").val(data.defecttype);
	$("#RoomSignForm").find("input[name=LENGTH]").val(data.length);
	$("#RoomSignForm").find("input[name=WIDTH]").val(data.width);
	$("#RoomSignForm").find("select[name=MATERIAL]").val(data.material);
	$("#RoomSignForm").find("select[name=COLOR]").val(data.color);
	$("#RoomSignForm").find("input[name=O_COLOR]").val(data.oColor);
	$("#RoomSignForm").find("input[name=S_COUNT]").val(data.sCount);
	$("#RoomSignForm").find("select[name=LIABILITY_Z]").val(data.liabilityZ);
	$("#RoomSignForm").find("select[name=LIABILITY_Q]").val(data.liabilityQ);
	$("#RoomSignForm").find("textarea[name=REMARK]").val(data.remark);
}


function ConduitDataInit(data){

	$("#RoomSignForm").find("#GID").val(data.gid);
	$("#RoomSignForm").find("#SIGNID").val(data.signid);
	$("#RoomSignForm").find("input[name=SIGNANGE_CONTENT]").val(data.signangeContent);
	$("#RoomSignForm").find("select[name=DEFECTTYPE]").val(data.defecttype);
	$("#RoomSignForm").find("input[name=LENGTH]").val(data.length);
	$("#RoomSignForm").find("input[name=WIDTH]").val(data.width);
	$("#RoomSignForm").find("select[name=MATERIAL]").val(data.material);
	$("#RoomSignForm").find("select[name=COLOR]").val(data.color);
	$("#RoomSignForm").find("input[name=O_COLOR]").val(data.oColor);
	$("#RoomSignForm").find("input[name=S_COUNT]").val(data.sCount);
	$("#RoomSignForm").find("select[name=LIABILITY_Z]").val(data.liabilityZ);
	$("#RoomSignForm").find("select[name=LIABILITY_Q]").val(data.liabilityQ);
	$("#RoomSignForm").find("textarea[name=REMARK]").val(data.remark);
}

</script>
</html>