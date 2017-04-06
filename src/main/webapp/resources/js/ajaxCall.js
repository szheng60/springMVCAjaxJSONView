/**
 * Created by xinyu on 4/5/2017.
 */

$(document).ready(function () {
    $('button').on('click', function (e) {
        var target = e.target;
        e.preventDefault();
        viaAjax(target.id);
    });

    function viaAjax(method) {
        var input = {};
        input["username"] = $('#username').val();
        input["email"] = $('#email').val();
        input["date"] = $('#date').val();
        var url = '/api/public-' + method;
        $.ajax({
            type: "POST",
            contentType: "application/json",
            url: url,
            data: JSON.stringify(input),
            dataType: 'json',
            success: function (data) {
                console.log(data);
                displayResult(data);
            },
            error: function (e) {
                alert('Error');
            },
            done: function () {
                alert('done');
            }
        });
    };
    function displayResult(result) {
        var json = "<h4>Response</h4><pre>" + JSON.stringify(result, null, 4) + "</pre>";
        $('#result').html(json);
    }
})