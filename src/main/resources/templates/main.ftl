<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.css"/>
    <link rel="stylesheet" href="/css/main.css"/>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.js"></script>
    <meta charset="UTF-8">
    <title>Freemarker Guide</title>
    <script type="text/javascript">

        function realtimeClock() {
            $('.change_time').text(getTimeStamp());
            setTimeout("realtimeClock()", 1000);
        }


        function getTimeStamp() { // 24시간제
            var d = new Date();

            var s =
/*                    leadingZeros(d.getFullYear(), 4) + '-' +
                    leadingZeros(d.getMonth() + 1, 2) + '-' +
                    leadingZeros(d.getDate(), 2) + ' ' +*/

                    leadingZeros(d.getHours(), 2) + ':' +
                    leadingZeros(d.getMinutes(), 2) + ':' +
                    leadingZeros(d.getSeconds(), 2);

            return s;
        }


        function leadingZeros(n, digits) {
            var zero = '';
            n = n.toString();

            if (n.length < digits) {
                for (i = 0; i < digits - n.length; i++)
                    zero += '0';
            }
            return zero + n;
        }

    </script>
</head>

<body onload="realtimeClock()">

<div class="content row">
    <div class="ui statistic" style="margin-left: 80px">
        <div class="value">
           <a href="enterPage.do"> <p class="change_time" style="color: black"></p> </a>
        </div>
    </div>
</div>

<div class="row">

</div>
</body>

</html>