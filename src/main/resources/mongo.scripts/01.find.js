

var cdb = db.getSisterDB("purchasesDB")
var results = cdb.purchases
                 .find({totalPrice: {$gt:2000} }, {_id:0,shortDate:1,totalPrice:1,totalItems:1,customerId:1})
                 .limit(5)
                 .toArray()
printjson(results)
