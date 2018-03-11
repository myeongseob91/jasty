<!DOCTYPE html>
<html>

<body class="template">

<div class="row">
<#include "/common/high.ftl">
</div>

<div class="ui grid container">
    <div class="row" id="page-header">
        <!-- -->

        <div class="ui special cards">

            <div class="card">
                <div class="blurring dimmable image">
                    <div class="ui inverted dimmer">
                        <div class="content">
                            <div class="center">
                                <div class="ui primary button">Add Friend</div>
                            </div>
                        </div>
                    </div>
                    <img src="/image/image.png">
                </div>
                <div class="content">
                    <a class="header">Lee Hyun Young</a>
                    <form action="/imageFile" id="fileUpload" name="fileUpload" method="post" enctype="multipart/form-data">
                        <input type="file" name="file">
                        <input type="submit" ></input>
                    </form>

                    <div class="meta">
                        <span class="date">strange woman</span>
                    </div>
                </div>
                <div class="extra content">
                    <a>
                        <i class="users icon"></i>
                        2 Members
                    </a>
                </div>
            </div>
        </div>



    </div>
    <div class="row" id="article">
        <div class="eleven wide column">

            <div class="ui feed">
                <div class="event">
                    <div class="label">
                        <img src="/image/elliot.jpg">
                    </div>
                    <div class="content">
                        <div class="summary">
                            <a class="user">
                                Elliot Fu
                            </a> added you as a friend
                            <div class="date">
                                1 Hour Ago
                            </div>
                        </div>
                        <div class="meta">
                            <a class="like">
                                <i class="like icon"></i> 4 Likes
                            </a>
                        </div>
                    </div>
                </div>
                <div class="event">
                    <div class="label">
                        <img src="/image/helen.jpg">
                    </div>
                    <div class="content">
                        <div class="summary">
                            <a>Helen Troy</a> added <a>2 new illustrations</a>
                            <div class="date">
                                4 days ago
                            </div>
                        </div>
                        <div class="extra images">
                            <a><img src="/image/image.png"></a>
                            <a><img src="/image/image.png"></a>
                        </div>
                        <div class="meta">
                            <a class="like">
                                <i class="like icon"></i> 1 Like
                            </a>
                        </div>
                    </div>
                </div>
                <div class="event">
                    <div class="label">
                        <img src="/image/jenny.jpg">
                    </div>
                    <div class="content">
                        <div class="summary">
                            <a class="user">
                                Jenny Hess
                            </a> added you as a friend
                            <div class="date">
                                2 Days Ago
                            </div>
                        </div>
                        <div class="meta">
                            <a class="like">
                                <i class="like icon"></i> 8 Likes
                            </a>
                        </div>
                    </div>
                </div>
                <div class="event">
                    <div class="label">
                        <img src="/image//joe.jpg">
                    </div>
                    <div class="content">
                        <div class="summary">
                            <a>Joe Henderson</a> posted on his page
                            <div class="date">
                                3 days ago
                            </div>
                        </div>
                        <div class="extra text">
                            Ours is a life of constant reruns. We're always circling back to where we'd we started, then starting all over again. Even if we don't run extra laps that day, we surely will come back for more of the same another day soon.
                        </div>
                        <div class="meta">
                            <a class="like">
                                <i class="like icon"></i> 5 Likes
                            </a>
                        </div>
                    </div>
                </div>
                <div class="event">
                    <div class="label">
                        <img src="/image/justen.jpg">
                    </div>
                    <div class="content">
                        <div class="summary">
                            <a>Justen Kitsune</a> added <a>2 new photos</a> of you
                            <div class="date">
                                4 days ago
                            </div>
                        </div>
                        <div class="extra images">
                            <a><img src="/image/image.png"></a>
                            <a><img src="/image/image.png"></a>
                        </div>
                        <div class="meta">
                            <a class="like">
                                <i class="like icon"></i> 41 Likes
                            </a>
                        </div>
                    </div>
                </div>
            </div>

            <div class="ui basic segment">
               <#-- <div class="ui basic circular huge button">
                    <a href="#">Previous</a>
                </div>
                <div class="ui basic circular huge button">
                    <a href="#">Next</a>
                </div>-->
            </div>
        </div>
        <div class="four wide right floated column">
            <div class="ui secondary segment">
                <h4 class="ui header">
                    About
                </h4>
                <p>
                    Etiam porta <i>sem malesuada magna mollis euismod</i>. Cras mattis consectetur purus sit amet fermentum. Aenean lacinia bibendum nulla sed consectetur.
                </p>
            </div>
            <h4 class="ui header">
                Archives
            </h4>
            <div class="ui list">
                <a class="item">Septempber 2017</a><a class="item">August 2017</a><a class="item">June 2017</a><a class="item">April 2017</a><a class="item">March 2017</a><a class="item">February 2017</a><a class="item">January 2017</a><a class="item">December 2016</a><a class="item">October 2016</a><a class="item">July 2016</a><a class="item">July 2016</a><a class="item">May 2016</a><a class="item">April 2016</a><a class="item">January 2016</a><a class="item">May 2015</a>
            </div>
            <div class="ui hidden divider"></div>
            <h4 class="ui header">
                Elsewhere
            </h4>
            <div class="ui list">
                <a class="item">GitHub</a><a class="item">Twitter</a><a class="item">Google+</a><a class="item">Facebook</a>
            </div>
        </div>
    </div>
</div>

<div class="row">
<#include "/common/low.ftl">
</div>


</body>

</html>