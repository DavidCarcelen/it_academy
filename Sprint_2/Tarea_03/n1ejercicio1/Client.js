db.createCollection('Client', {validator: {$jsonSchema: {bsonType: 'object',title: 'Client',required: ['name'],properties:{name:{bsonType: 'string'},data:{bsonType: 'object',title: 'object',properties:{address:{bsonType: 'string'},telephone:{bsonType: 'string'},email:{bsonType: 'string'},register_date:{bsonType: 'timestamp'}}},last_shoppings:{bsonType: 'object',title: 'object',properties:{glasses:{bsonType: 'object',title: 'object',properties:{brand:{bsonType: 'string'},graduation:{bsonType: 'object',title: 'object',properties:{right:{bsonType: 'decimal'},left:{bsonType: 'decimal'}}},glass_color:{bsonType: 'object',title: 'object',properties:{right:{bsonType: 'string'},left:{bsonType: 'string'}}},frame:{enum: pasta, metal, flotant},price:{bsonType: 'double'}}}}}}}}});