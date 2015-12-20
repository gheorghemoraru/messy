(function() {
  $(function() {
    return $.get("/messages", function(messages) {
      return $.each(messages, function(index, message) {
        var body, name;
        name = $("<div>").text(message.name);
        body = $("<div>").text(message.body);
        return $("#messages").append($("<li>").append(name).append(body));
      });
    });
  });

}).call(this);

//# sourceMappingURL=index.js.map
