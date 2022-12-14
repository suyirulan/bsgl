<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<div id="con-close-modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"
     style="display: none" data-backdrop="static" data-keyboard="false">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h4 class="modal-title">CBA-数据维护</h4>
            </div>
            <form action="" method="POST" id="RoomForm">
                <input type="hidden" id="GID" value="" />
                <div class="modal-body">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="kksno" class="control-label">KKS码：</label>
                                <input type="text" class="form-control" id="kksno" placeholder="KKS码">
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="dtname" class="control-label">中文名称：</label>
                                <input type="text" class="form-control" id="dtname" placeholder="中文名称">
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <div class="form-group">
                                <label for="postion" class="control-label">房间位置：</label>
                                <input type="text" class="form-control" id="postion" placeholder="房间位置">
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <div class="form-group no-margin">
                                <label for="remark" class="control-label">备注</label>
                                <textarea class="form-control autogrow" id="remark" placeholder="Write something about yourself"
                                          style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 104px"></textarea>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default waves-effect" data-dismiss="modal">取消</button>
                    <button type="button" class="btn btn-info waves-effect waves-light" onclick="Save()">保存</button>
                </div>
            </form>
        </div>
    </div>
</div>
