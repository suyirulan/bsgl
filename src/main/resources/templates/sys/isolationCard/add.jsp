<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div id="con-close-modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"
    style="display: none" data-backdrop="static" data-keyboard="false">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h4 class="modal-title">运行行政隔离牌-数据维护</h4>
            </div>
            <form action="" method="POST" id="RoomForm">
                <input type="hidden" id="GID" name="gid" value="" />
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
                                <label for="deviceName" class="control-label">设备名称：</label>
                                <input type="text" class="form-control" id="deviceName" placeholder="设备名称">
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-4">
                            <div class="form-group">
                                <label for="isolationType" class="control-label">隔离类型：</label>
                                <select id="isolationType" class="form-control">
                                    <option value="运行隔离">运行隔离</option>
                                    <option value="行政隔离">行政隔离</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="form-group">
                                <label for="unitNo" class="control-label">机组号：</label>
                                <select id="unitNo" class="form-control">
                                    <option value="1">1#</option>
                                    <option value="2">2#</option>
                                    <option value="3">3#</option>
                                    <option value="4">4#</option>
                                    <option value="5">5#</option>
                                    <option value="6">6#</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="form-group">
                                <label for="cType" class="control-label">类型：</label>
                                <select id="cType" class="form-control">
                                    <option value="A类">A类</option>
                                    <option value="B类">B类</option>
                                    <option value="F类">F类</option>
                                    <option value="G类">G类</option>
                                    <option value="H类">H类</option>
                                    <option value="I类">I类</option>
                                    <option value="J类">J类</option>
                                </select>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-4">
                            <div class="form-group">
                                <label for="dutyArea" class="control-label">所属责任区：</label>
                                <select id="dutyArea" class="form-control">
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                    <option value="4">4</option>
                                    <option value="5">5</option>
                                    <option value="6">6</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-md-8">
                            <div class="form-group">
                                <label for="iState" class="control-label">状态：</label>
                                <div>
                                    <div class="radio radio-info radio-inline">
                                        <input type="radio" id="heatPreservation1" value="0" name="iState" checked="checked">
                                        <label for="iState1">0</label>
                                    </div>
                                    <div class="radio radio-inline">
                                        <input type="radio" id="iState2" value="C" name="iState">
                                        <label for="iState2">C</label>
                                    </div>
                                    <div class="radio radio-inline">
                                        <input type="radio" id="iState3" value="LC" name="iState">
                                        <label for="iState3">LC</label>
                                    </div>
                                    <div class="radio radio-inline">
                                        <input type="radio" id="iState4" value="LD" name="iState">
                                        <label for="iState4">LD</label>
                                    </div>
                                    <div class="radio radio-inline">
                                        <input type="radio" id="iState5" value="L0" name="iState">
                                        <label for="iState5">L0</label>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>

                    <div class="row">
                        <div class="col-md-12">
                            <div class="form-group no-margin">
                                <label for="postion" class="control-label">位置</label>
                                <textarea class="form-control autogrow" id="postion" placeholder="Write something about yourself"
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
</div><!-- /.modal -->