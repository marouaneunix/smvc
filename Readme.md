```
var Care = Backbone.Model.extend({
	defaults: {
  	'color': 'red',
    'type': 'simple',
    'name': 'Seat'
  }
});

var CareView = Backbone.View.extend({
  events: {
  	"change input": "changeModel"
  },
  
  changeModel: function(event) {
  	this.model.set('name', event.target.value);
  },
  
  initialize: function() {
    this.model.on('change', function() {
      this.render()
    }, this);
  },
  
  render: function() {
  		var carName = this.model.get('name') || 'Golf';
  		this.$("#myLi").text(carName);
  }
});

var car = new Care();
var careView = new CareView({model: car, el: '#banner-message'});

```
