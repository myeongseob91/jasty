<!DOCTYPE html>
<html>

<body class="template">

<div class="row">
<#include "/common/high.ftl">
</div>

<div class="ui grid container">
    <div class="row" id="page-header">
        <div class="ui basic segment">

            <form action="/join/join.do" method="post">

            <div class="ui form">
                <div class="fields">
                    <div class="field">
                        <label>First name</label>
                        <input name="firstname" type="text" placeholder="First Name">
                    </div>
                    <div class="eight wide field">
                        <label>Name</label>
                        <input name="name" type="text" placeholder="Name">
                    </div>
                </div>
                <div class="eight wide field">
                    <label>email</label>
                    <input name="email" type="text" placeholder="Email">
                </div>
                <div class="eight wide field">
                    <label>phonenum</label>
                    <input name="phonenum" type="text" placeholder="Phonenum">
                </div>
                <div class="eight wide field">
                    <label>pwd</label>
                    <input name="pwd" type="text" placeholder="Pwd">
                </div>
                <div class="eight wide field">
                    <label>birth</label>
                    <input name="birth" type="text" placeholder="Birth">
                </div>

            </div>

                <input type="submit" value="회원가입">

            </form>

            </div>
        </div>
    </div>
</div>

<div class="row">
<#include "/common/low.ftl">
</div>


</body>

</html>