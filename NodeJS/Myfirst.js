var http = require('http');
var dt = require('./Myfirstmodule');

http.createServer(function (req, res) {
    res.writeHead(200, {'Content-Type': 'text/html'});
    res.end('Hello world! my date and time is: ' + dt.myDateTime());
    res.end(); 
}).listen(8080);