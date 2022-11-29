<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div id="con-close-modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"
    style="display: none" data-backdrop="static" data-keyboard="false">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h4 class="modal-title">标准化巡检分区-数据维护</h4>
            </div>
            <form action="" method="POST" id="RoomForm">
                <input type="hidden" id="GID" value=""/>
                <div class="modal-body">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="ROOMNO" class="control-label">分区编号：</label>
                                <input type="text" class="form-control" id="ROOMNO" placeholder="分区编号">
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="ROOMNAME" class="control-label">分区名称：</label>
                                <input type="text" class="form-control" id="ROOMNAME" placeholder="分区名称">
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-4">
                            <div class="form-group">
                                <label for="" class="control-label">所属责任区：</label>
                                <select id="DUTY_AREA" class="form-control">
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                    <option value="4">4</option>
                                    <option value="5">5</option>
                                    <option value="6">6</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="form-group">
                                <label for="EDITUSER" class="control-label">修改人：</label>
                                <input type="text" class="form-control" readonly="readonly" id="EDITUSER" placeholder="修改人">
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="form-group">
                                <label for="luptime" class="control-label">修改时间：</label>
                                <input type="text" class="form-control" readonly="readonly" id="luptime" placeholder="修改时间">
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <div class="form-group no-margin">
                                <label for="ROOMDIS" class="control-label">分区描述</label>
                                <textarea class="form-control autogrow" id="ROOMDIS" placeholder="Write something about yourself"
                                    style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 104px">                                                        </textarea>
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
</div><!-- /.modal -->