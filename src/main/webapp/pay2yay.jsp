    <html>
    <head>
        <title>Money Transfer</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Bootstrap -->
        <link href="dist/css/bootstrap.min.css" rel="stylesheet" media="screen">
    </head>

    <body>
        <form class="form-horizontal" role="form" action="pay2yay.html" method="get">
            <div class="row">
            <div class="col-md-5 col-md-offset-4"><h2 class="form-signing-heading">Money Transfer Form</h2></div>
            </div>

            <div class="form-group">
            <div class="row">
                <div class="col-md-1 col-md-offset-3"><label>Sender</label></div>
                <div class="col-md-3"><select name="sender" class="form-control">
                    <option>John Doe</option>
                    <option>Mr.Smith</option>
                    <option>ScratchCard</option>
                </select></div>
            </div>
            </div>

            <div class="form-group">
            <div class="row">
                <div class="col-md-1 col-md-offset-3"><label>Receiver</label></div>
                <div class="col-md-3"><select name="receiver" class="form-control">
                    <option>Jane Doe</option>
                    <option>Mrs.Smith</option>
                    <option>System</option>
                </select></div>
            </div>
            </div>

            <div class="form-group">
            <div class="row">
                <div class="col-md-1 col-md-offset-3"><label>Amount</label></div>
                <div class="col-md-3">
                <div class="input-group">
                    <input type="amount" class="form-control" placeholder="Amount" name="amount">
                    <span class="input-group-addon">$</span>
                </div>
                </div>
            </div>
            </div>

            <div class="form-group">
            <div class="col-md-offset-5">
                <button type="send" class="btn btn-success">Send</button>
                <button type="cancel" class="btn btn-link">Cancel</button>
            </div>
            </div>
        </form>

    </body>
    </html>

