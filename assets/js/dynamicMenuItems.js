/**
 * Costruisce dinamicamente i  titoli dei
 * paragrafi e li inserisce in un menu, il div deve avere
 * content="qualcosa" e un nome name="nome da mostrare nel menu".
 *
 * @param {String} content name of the attribute where search
 * @param {String} name name to display after into menu
 */
function load_and_set(content, name) {
  var contents = $("div[" + content + "]");
  for (i = 0; i < contents.length; i++) {
    var str =
      '<li class="nav-item">' +
      '<a class="nav-link active" href="#' +
      contents[i].id +
      '">' +
      contents[i].getAttribute(name) +
      "</a> </li>";
    $("#menu").append(str);
  }

  $('#navbarTogglerDemo02 > ul > li').click( function() {
    $(".navbar-toggler").click();
  })
}
