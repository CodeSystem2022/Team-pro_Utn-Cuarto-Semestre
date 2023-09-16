const express = require("express");
const app = express();
const cors = require("cors");
const mercadopago = require("mercadopago");

// REPLACE WITH YOUR ACCESS TOKEN AVAILABLE IN: https://developers.mercadopago.com/panel
mercadopago.configure({
    access_token: "",
});

app.use(express.urlencoded({ extended: false }));
app.use(express.json());

app.use(express.static("path.join(__dirname, "../client)));
app.use(cors());

app.get("/", function (req, res) {
    path.resolve(__dirname, "..", "client", "index.html");
});

app.post("/create_preference", (req, rest) => {
    let preference = {
        items: [
          {
            title: req.body.description,
            unit_price: Number(req.body.price),
            unit_price: Number(req.body.quantity),
          },
        ],
        back_urls: {
            sucess: "http://localhost:8080/feedback",
            failure: "http://localhost:8080/feedback",
            pending: "http://localhost:8080/feedback",
        },
        auto_return: "approved",
       };

       mercadopago.preferences
          .create(preference)
          .then(function (response) {
            res.json({
                id: response.body.id,
              });
           })
           .catch(function (error) {
            console.log(error);
           });
    });

  app.get("/feedback", function (req, res) {
    res.json({
        Payment: req.query.payment_id,
        Status: req.query.status,
        MerchantOrder: req.query.merchant_order_id,
    });
});

   app.listen(8080, () => {
    console.log("The server is now running on Port 8080");
   });
