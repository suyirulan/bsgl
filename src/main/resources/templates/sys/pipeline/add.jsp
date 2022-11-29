<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div id="con-close-modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"
    style="display: none" data-backdrop="static" data-keyboard="false">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h4 class="modal-title">管道标识-数据维护</h4>
            </div>
            <form action="" method="POST" id="PipelineForm">
                <input type="hidden" id="GID" name="gid" value="" />
                <div class="modal-body">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="pipno" class="control-label">管道编号：</label>
                                <input type="text" class="form-control" name="pipno"  placeholder="管道编号">
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="pipname" class="control-label">管道名称：</label>
                                <input type="text" class="form-control" name="pipname" placeholder="管道名称">
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-4">
                            <div class="form-group">
                                <label for="flowTo" class="control-label">流向：</label>
                                <select name="flowTo" class="form-control">
                                    <option value="1">左</option>
                                    <option value="2">右</option>
                                    <option value="3">上</option>
                                    <option value="4">下</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="form-group">
                                <label for="medium" class="control-label">介质：</label>
                                <select name="medium" class="form-control">
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                    <option value="4">4</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="form-group">
                                <label for="pipeDiameter" class="control-label">管径(mm)：</label>
                                <input type="text" class="form-control" name="pipeDiameter" placeholder="管径(mm)">
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-4">
                            <div class="form-group">
                                <label for="hangLength" class="control-label">可挂长度：</label>
                                <input type="text" class="form-control" name="hangLength">
                            </div>
                        </div>
                        <div class="col-md-8">
                            <div class="form-group">
                                <label for="heatPreservation" class="control-label">有无保温：</label>
                                <div>
                                    <div class="radio radio-info radio-inline">
                                        <input type="radio" id="heatPreservation1" value="1" name="heatPreservation"
                                            checked="checked">
                                        <label for="heatPreservation1">有</label>
                                    </div>
                                    <div class="radio radio-inline">
                                        <input type="radio" id="heatPreservation2" value="0" name="heatPreservation">
                                        <label for="heatPreservation2">无</label>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-4">
                            <div class="form-group">
                                <label for="workshop" class="control-label">厂房：</label>
                                <input type="text" class="form-control" id="workshop" placeholder="厂房">
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="form-group">
                                <label for="azimuthSymbolic" class="control-label">标志性设备方位：</label>
                                <input type="text" class="form-control" name="azimuthSymbolic">
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="form-group">
                                <label for="azimuthLately" class="control-label">最近设备方位：</label>
                                <input type="text" class="form-control" name="azimuthLately" placeholder="最近设备方位">
                            </div>
                        </div>
                    </div>


                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="EDITUSER" class="control-label">修改人：</label>
                                <input type="text" class="form-control" readonly="readonly" name="EDITUSER" placeholder="修改人">
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="luptime" class="control-label">修改时间：</label>
                                <input type="text" class="form-control" readonly="readonly" name="luptime" placeholder="修改时间">
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