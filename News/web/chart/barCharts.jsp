<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>

<head>
    <meta charset="utf-8">
    <title>ECharts</title>


</head>
<body>
<div align="center">
    <div id="RegBar" style="width: 800px;height:600px;"></div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/echarts/echarts.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/echarts/macarons.js"></script>
<script type="text/javascript">
    var myChart = echarts.init(document.getElementById('RegBar'), 'macarons');

    var option = {
        title: {
            text: '博客一周访问量'
        },
        tooltip: {},
        legend: {
            data: ['访问人数', '周平均访问']
        },
        xAxis: {
            data: ['星期一', '星期二', '星期三', '星期四', '星期五', '星期六', '星期七'],
        },
        yAxis: {},
        series: [{
            name: '访问人数',
            type: 'bar',
            data: [10, 8, 6, 8, 10, 5, 4]
        },
            {
                name: '周平均访问',
                type: 'line',
                data: [6, 5, 9, 7, 3, 9, 6]
            }]
    };
    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);


</script>
