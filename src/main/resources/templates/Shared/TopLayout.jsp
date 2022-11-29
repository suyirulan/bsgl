<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="topbar">
    <!-- LOGO -->
    <div class="topbar-left">
        <div class="text-center">
            <a href="/signmanage/" class="logo"><span>标识管理系统 </span></a>
        </div>
    </div>
    <!-- Button mobile view to collapse sidebar menu -->
    <div class="navbar navbar-default" role="navigation">
        <div class="container">
            <div class="">
                <form class="navbar-form pull-left" role="search">
                    <button type="submit" class="btn btn-search"><i class="fa fa-search"></i></button>
                </form>
                <ul class="nav navbar-nav navbar-right pull-right">
                    <li class="hidden-xs">
                        <a href="#" id="btn-fullscreen" class="waves-effect"><i class="md md-crop-free"></i></a>
                    </li>
                    <li class="hidden-xs">
                        <a href="${pageContext.request.contextPath}/login/loginOut.action"><i class="md md-settings-power"></i></a>
                    </li>

                </ul>
            </div>
            <!--/.nav-collapse -->
        </div>
    </div>
</div>