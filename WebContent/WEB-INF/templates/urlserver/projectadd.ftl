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
                <h3 class="box-title">Project Add</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
                <form id="projectadd" role="form" method="post"
                      action="${Domain.base}/urlserver/project/addProject">
                    <!-- text input -->
                    <div class="form-group">
                        <label>Project Text</label>
                        <input name="projectname" type="text" class="form-control" placeholder="Enter ...">
                    </div>

                    <!-- textarea -->
                <#--<div class="form-group">
                    <label>InterceptorValue Textarea</label>
                    <textarea name="interceptorvalue" class="form-control" rows="3"
                              placeholder="Enter ..."></textarea>
                </div>-->
                    <div class="form-group">
                        <label>Projectremark Textarea</label>
                        <textarea name="projectremark" class="form-control" rows="8"
                                  placeholder="Enter ..."></textarea>
                    </div>
                    <div class="box-footer">
                        <button type="submit" class="btn btn-primary">Submit</button>
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