<#include "header.ftl">

<#--广告图-->
<div class="home-device"><a class="arrow-left" href="#"></a> <a class="arrow-right" href="#"></a>

    <div class="swiper-main">
        <div class="swiper-container swiper1">
            <div class="swiper-wrapper">
            <#list productsPage.list as item>
                <div class="swiper-slide"><a href="${Domain.base}/products/${item.id}" target='_blank'><img
                        src="${item.Img()}"></a></div>
            </#list>
            </div>
        </div>
    </div>
    <div class="pagination pagination1"></div>
</div>
<div class="clear"></div>
<!-- 文化&新闻动态 -->
<div class="wrapper col4">
    <div id="container" class="clear">
        <div id="homepage" class="clear">
            <!-- 文化动态 -->
            <div class="fl_left" class="testimonials">
                <h3>文化动态</h3>

                <div class="swiper-container swiper-v">
                    <div class="pagination-v"></div>
                    <div class="swiper-wrapper">
                    <#list productsErPage.list as item>
                        <div class="swiper-slide">
                            <a href="${Domain.base}/products/${item.id}" target='_blank'>
                                <h2 style="padding-top: 6px;padding-bottom: 6px;">${item.title}</h2>
                                <img src="${item.Img()}">
                            </a>
                        </div>
                    </#list>
                    </div>
                </div>
            </div>
            <!-- 新闻动态 -->
            <div class="fl_right">
                <h3>新闻动态</h3>
                <ul id="newslist" class="testimonials">
                    <!-- 代码动态添加 -->
                <#list newsPage.list as item>
                    <li><p class='name'><strong>标题：</strong>${item.title}
                        <strong>时间：</strong>--${item.time?string("yyyy-MM-dd")}</p>
                        <blockquote>
                        ${item.desc}
                        </blockquote>
                        <p class='readmore'><a target='_blank'
                                               href='${Domain.base}/news/${item.id}'><strong>阅读详情</strong></a></p></li>
                </#list>
                </ul>
            </div>
        </div>
    </div>
</div>

<#include "footer.ftl">
