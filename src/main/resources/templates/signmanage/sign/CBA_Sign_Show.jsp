<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<form action="" method="POST" id="KksSignFormShow">
    <input type="hidden" name="GID" value="" />
    <input type="hidden" name="SIGNID" value="" />
    <input type="hidden" name="signtype" value="A" id="sign_signtype"/>
    <input type="hidden" name="opt" value=""/>
	<input type="hidden" name="SIGNSTATE" value=""/>
	<input type="hidden" name="CREATE_Z" value=""/>
	<input type="hidden" name="CREATE_R" value=""/>
	<input type="hidden" name="CREATE_TIME" value=""/>
	<input type="hidden" name="DISTRIBUTE" value=""/>
	<input type="hidden" name="SENDEE" value=""/>
	<input type="hidden" name="SSENDEE" value=""/>
	<input type="hidden" name="PROCESSING" value=""/>
	<input type="hidden" name="PROCESSINGTIME" value=""/>
	<input type="hidden" name="NOHANDLE" value=""/>
	<input type="hidden" name="FLOWNO" value=""/>
	<input type="hidden" name="SEQUENCE" value=""/>
    
    <div class="modal-body">
        <div class="row">
            <div class="col-md-12">
                <div class="form-group">
                    <label class="control-label"  style="color: red;">标识内容（设备KKS码、中文名称等）：</label>
                    <input type="hidden" name="SIGNANGE_CONTENT" readonly value="" />
                    <input class="form-control" readonly name="SIGNANGE_CONTENT1" id="SIGNANGE_CONTENT1" style="width:100%"/>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <div class="form-group">
                    <label class="control-label" style="color: red;">位置:</label>
                    <input type="text" readonly class="form-control" name="POSITION" placeholder="位置">
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <div class="form-group">
                    <label class="control-label" style="color: red;">缺陷类型：</label>
                    <select name="DEFECTTYPE" disabled="disabled" class="form-control" style="width:100%">
                        <option value="1">01-标牌缺失</option>
                        <option value="2">02-标牌损坏</option>
                        <option value="3">03-支架损坏</option>
                        <option value="4">04-旧标牌需要换新标牌</option>
                        <option value="5">05-标牌信息错误</option>
                        <option value="6">06-其他</option>
                    </select>
                </div>
            </div>
            <div class="col-md-3">
                <div class="form-group">
                    <label class="control-label" style="color: red;">长（mm）:</label>
                    <input type="text" readonly class="form-control" name="LENGTH" value="90" />
                </div>
            </div>
            <div class="col-md-3">
                <div class="form-group">
                    <label class="control-label" style="color: red;">宽（mm）：</label>
                    <input type="text" readonly class="form-control" name="WIDTH" value="60" />
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4">
                <div class="form-group">
                    <label class="control-label" style="color: red;">材质:</label>
                    <select name="MATERIAL"  disabled="disabled" class="form-control" style="width:100%">
                        <option value="1"  selected>双色板</option>
                        <option value="2">不锈钢</option>
                        <option value="3">金属</option>
                    </select>
                </div>
            </div>
            <div class="col-md-4">
                <div class="form-group">
                    <label class="control-label" style="color: red;">颜色：</label>
                    <select name="COLOR" class="form-control" disabled="disabled" style="width:100%">
                    	<option value="1">01-红底白字</option>                        
                       	<option value="2" selected>02-蓝底白字</option>
                        <option value="3">03-绿底白字</option>
                        <option value="4">04-白底黑字</option>
                        <option value="5">05-其他</option>
                    </select>
                </div>
            </div>
            <div class="col-md-4">
                <div class="form-group">
                    <label class="control-label">其他颜色：</label>
                    <input type="text" readonly class="form-control" name="O_COLOR" />
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4">
                <div class="form-group">
                    <label class="control-label" style="color: red;">数量:</label>
                    <input type="text" readonly class="form-control" name="S_COUNT" />
                </div>
            </div>
            <div class="col-md-4">
                <div class="form-group">
                    <label class="control-label" style="color: red;">所属责任值：</label>
                    <select name="LIABILITY_Z" disabled="disabled" class="form-control">
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
                    <label class="control-label" style="color: red;">所属责任区：</label>
                    <select name="LIABILITY_Q" disabled="disabled" class="form-control">
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                        <option value="6">6</option>
                    </select>
                </div>
            </div>

        </div>
        <div class="row">
            <div class="col-md-6">
                <div class="form-group">
                    <label class="control-label col-md-6" style="padding-left: 0px;">是否CC1设备标牌</label>
                    <div class="control-label col-md-6">
                        <div class="radio radio-info radio-inline">
                            <input type="radio" id="ISCC11" value="1" name="ISCC1">
                            <label for="ISCC11">是</label>
                        </div>
                        <div class="radio radio-inline">
                            <input type="radio" id="ISCC12" value="0" name="ISCC1">
                            <label for="ISCC12">否</label>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <div class="form-group">
                    <label class="control-label col-md-6" style="padding-left: 0px;">是否需要搭脚手架</label>
                    <div class="control-label col-md-6">
                        <div class="radio radio-info radio-inline">
                            <input type="radio" value="1" name="ISSCAFFOLDING" id="ISSCAFFOLDING1">
                            <label for="ISSCAFFOLDING1">是</label>
                        </div>
                        <div class="radio radio-inline">
                            <input type="radio" id="ISSCAFFOLDING2" value="0" name="ISSCAFFOLDING">
                            <label for="ISSCAFFOLDING2">否</label>
                        </div>

                    </div>

                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <div class="form-group no-margin">
                    <label class="control-label">备注</label>
                    <textarea class="form-control autogrow" name="REMARK" readonly
                        style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 104px"></textarea>
                </div>
            </div>
        </div>
    </div>
</form>
<%@include file="attachments_manage_show.jsp"%>