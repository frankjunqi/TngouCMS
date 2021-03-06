<#include "headerleftmenu.ftl">
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <#--<section class="content-header">
        <h1>
            Page Header
            <small>Optional description</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Level</a></li>
            <li class="active">Here</li>
        </ol>
    </section>-->


    <!-- Main content -->
    <section class="content">
        <div class="box box-warning">
            <div class="box-header with-border">
                <h3 class="box-title">Interceptor Add</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
                <form id="interceptoradd" role="form" method="post"
                      action="${Domain.base}/urlserver/interceptor/editIntercepor">
                    <div class="form-group">
                        <label>InterceptorName Id</label>
                        <input name="id" type="text" class="form-control" value="${interceptor.id}"
                               placeholder="Enter ..." readonly></input>
                    </div>
                    <!-- text input -->
                    <div class="form-group">
                        <label>InterceptorName Text</label>
                        <input name="interceptorname" type="text" class="form-control" placeholder="Enter ..."
                               value="${interceptor.interceptorname}"></input>
                    </div>

                    <!-- textarea -->
                    <div class="form-group">
                        <label>InterceptorValue Textarea</label>
                        <textarea name="interceptorvalue" class="form-control" rows="3"
                                  placeholder="Enter ...">${interceptor.interceptorvalue}</textarea>
                    </div>
                    <div class="form-group">
                        <label>interceptorremark Textarea</label>
                        <textarea name="interceptorremark" class="form-control" rows="8"
                                  placeholder="Enter ...">${interceptor.interceptorremark}</textarea>
                    </div>

                    <div class="form-group">
                        <label>Interceptor createtime</label>
                        <input name="createtime" type="text" class="form-control" value="${interceptor.createtime!"null"}"
                               placeholder="Enter ..." readonly></input>
                    </div>
                    <div class="form-group">
                        <label>Interceptor createauthor</label>
                        <input name="createauthor" type="text" class="form-control" value="${interceptor.createauthor!"null"}"
                               placeholder="Enter ..." readonly></input>
                    </div>

                    <div class="box-footer">
                        <button type="submit" class="btn btn-primary">Update</button>
                    </div>
                </form>
            </div>
            <!-- /.box-body -->
        </div>
    </section>
    <!-- /.content -->
</div>
<script>

</script>
<!-- /.content-wrapper -->
<#include "footermenu.ftl">