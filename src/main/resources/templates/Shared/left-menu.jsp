<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="left side-menu">
                <div class="slimScrollDiv" style="position: relative; overflow: hidden; width: auto; height: 521px;"><div class="sidebar-inner slimscrollleft" style="overflow: hidden; width: auto; height: 521px;">
                    <div class="user-details">
                    	<!-- 
                        <div class="pull-left">
                            <img src="assets/images/users/avatar-1.jpg" alt="" class="thumb-md img-circle">
                        </div>
                         -->
                        <div class="user-info">
                            <div class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">${RName}<span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="javascript:void(0)"><i class="md md-settings-power"></i> 注销</a></li>
                                </ul>
                            </div>                            
                            <p class="text-muted m-0">${USERNAME}</p>
                        </div>
                    </div>
                    <!--- Divider -->
                    <div id="sidebar-menu">
                        <ul>
                            <li class="has_sub">
                                <a href="#" class="waves-effect waves-light active"><i class="md md-palette"></i> <span> 标识管理</span> <span class="pull-right"><i class="md md-add"></i></span></a>
                                <ul class="list-unstyled" style="display: block;">
                                	<li><a href="/signmanage/Sign/SignIndex_CBA">设备标识维护</a></li>  
                                	<li><a href="/signmanage/Sign/SignIndex_Room">门牌标识维护</a></li>          
                                	<li><a href="/signmanage/Sign/SignIndex_Pipeline">管道标识维护</a></li>         
                                	<li><a href="/signmanage/Sign/SignIndex_IsolatioCard">隔离标识维护</a></li>         
                                	<li><a href="/signmanage/flow/Make_Add">标识悬挂流程发起</a></li>                               
                                </ul>
                            </li>
                            <li class="has_sub">
                                <a href="#" class="waves-effect waves-light"><i class="md md-redeem"></i> <span> 数据统计 </span> <span class="pull-right"><i class="md md-add"></i></span></a>
                                <ul class="list-unstyled">
                                    <li><a href="/signmanage/Sign/SignSearch">标识查询</a></li>
                                </ul>
                            </li>
                             <li class="has_sub">
                                <a href="#" class="waves-effect waves-light"><i class="md md-mail"></i><span> 基础数据 </span><span class="pull-right"><i class="md md-add"></i></span></a>
                                <ul class="list-unstyled">
                                    <li><a href="/signmanage/sys/room/List">标准化巡检分区</a></li>
                                    <li><a href="/signmanage/sys/pipeline/index">管道数据</a></li>
                                    <li><a href="/signmanage/sys/isolationCard/index">运行隔离牌数据</a></li>
                                    <li><a href="/signmanage/sys/cba/index">KKS设备数据维护</a></li>
                                </ul>
                            </li>
                             <li>
                                <a href="http://it.jnpc.com.cn:9999/webdoc/real/Pub8a9790a478004655017800cd31530029.html?STATE=0&OPERATE=3" target="_blank" class="waves-effect waves-light"><i class="md md-home"></i><span> 操作手册 </span></a>
                            </li>
                            
                        </ul>
                        <div class="clearfix"></div>
                    </div>
                    <div class="clearfix"></div>
                </div><div class="slimScrollBar" style="background: rgb(122, 134, 143); width: 5px; position: absolute; top: 0px; opacity: 0.4; display: none; border-radius: 7px; z-index: 99; right: 1px; height: 372.859px; visibility: visible;"></div><div class="slimScrollRail" style="width: 5px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 7px; background: rgb(51, 51, 51); opacity: 0.2; z-index: 90; right: 1px;"></div></div>
</div>