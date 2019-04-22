<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <div id="pie" style="width: 800px;height:600px;"></div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/echarts/echarts.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/echarts/macarons.js"></script>
<script type="text/javascript">
    var myChart = echarts.init(document.getElementById('pie'), 'macarons');
    var option = {
        title: {
            text: '博客分类文章浏览数',
            subtext: '真实有效',
            x: 'center'
        },
        tooltip: {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            data: ['JAVA基础', '数据结构与算法', '数据库', '计算机网络', 'JAVAEE', 'JAVAWeb基础']
        },
        series: [
            {
                name: '博客分类',
                type: 'pie',
                radius: '55%',
                center: ['50%', '60%'],
                data: [
                    {value: 250, name: 'JAVA基础'},
                    {value: 158, name: '数据结构与算法'},
                    {value: 278, name: '数据库'},
                    {value: 100, name: '计算机网络'},
                    {value: 500, name: 'JAVAEE'},
                    {value: 700, name: 'JAVAWeb基础'}
                ],
                itemStyle: {
                    emphasis: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            }
        ]
    };

    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);


</script>
</body>
</html>
