$ ->
  $.get "/messages", (messages) ->
    $.each messages, (index, message) ->
      name = $("<div>").text message.name
      body = $("<div>").text message.body
      $("#messages").append $("<li>").append(name).append(body)