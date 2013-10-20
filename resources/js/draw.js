var sampleJson = {
    "deadline": "Oct 20, 2013 4:54:17 AM",
    "hoursLeft": 20,
    "tasks": [
        {
            "startDate": "Oct 20, 2013 4:54:17 AM",
            "endDate": "Oct 20, 2013 4:54:17 AM",
            "difficulty": 8,
            "percentDone": 75,
            "resources": [
                {
                    "type": "TEXT",
                    "name": "www.google.com"
                },
                {
                    "type": "TEXT",
                    "name": "www.facebook.com"
                },
                {
                    "type": "TEXT",
                    "name": "www.heroku.com"
                }
            ],
            "title": "Task1",
            "id": 0,
            "presentation": {
                "bkColor": "RED",
                "shape": "CIRCLE"
            },
            "link": "MANDATORY",
            "socialFeed": {
                "id": 2,
                "text": "ML assignment is too hard",
                "agree": 10,
                "disagree": 20
            }
        },
        {
            "startDate": "Oct 20, 2013 4:54:17 AM",
            "endDate": "Oct 20, 2013 4:54:17 AM",
            "difficulty": 8,
            "percentDone": 75,
            "resources": [
                {
                    "type": "TEXT",
                    "name": "www.google.com"
                }
            ],
            "title": "Task2",
            "id": 1,
            "presentation": {
                "bkColor": "RED",
                "shape": "CIRCLE"
            },
            "link": "MANDATORY",
            "socialFeed": {
                "id": 2,
                "text": "ML assignment is too hard",
                "agree": 10,
                "disagree": 20
            }
        },
        {
            "startDate": "Oct 20, 2013 4:54:17 AM",
            "endDate": "Oct 20, 2013 4:54:17 AM",
            "difficulty": 7,
            "percentDone": 55,
            "resources": [
                {
                    "type": "TEXT",
                    "name": "www.google.com"
                }
            ],
            "title": "Task3",
            "id": 2,
            "presentation": {
                "bkColor": "GREEN",
                "shape": "CIRCLE"
            },
            "link": "MANDATORY",
            "socialFeed": {
                "id": 2,
                "text": "ML assignment is too hard",
                "agree": 10,
                "disagree": 20
            }
        },
        {
            "startDate": "Oct 20, 2013 4:54:17 AM",
            "endDate": "Oct 20, 2013 4:54:17 AM",
            "difficulty": 4,
            "percentDone": 95,
            "resources": [
                {
                    "type": "TEXT",
                    "name": "www.google.com"
                }
            ],
            "title": "Task4",
            "id": 3,
            "presentation": {
                "bkColor": "GREEN",
                "shape": "CIRCLE"
            },
            "link": "MANDATORY",
            "socialFeed": {
                "id": 2,
                "text": "ML assignment is too hard",
                "agree": 10,
                "disagree": 20
            }
        },
        {
            "startDate": "Oct 20, 2013 4:54:17 AM",
            "endDate": "Oct 20, 2013 4:54:17 AM",
            "difficulty": 1,
            "percentDone": 0,
            "resources": [
                {
                    "type": "TEXT",
                    "name": "www.google.com"
                }
            ],
            "title": "Task5",
            "id": 4,
            "presentation": {
                "bkColor": "GREEN",
                "shape": "CIRCLE"
            },
            "link": "MANDATORY",
            "socialFeed": {
                "id": 2,
                "text": "ML assignment is too hard",
                "agree": 10,
                "disagree": 20
            }
        }
    ],
    "title": "Asgnmnt1",
    "id": 0,
    "presentation": {
        "bkColor": "RED",
        "shape": "CIRCLE"
    },
    "link": "MANDATORY",
    "socialFeed": {
        "id": 2,
        "text": "ML assignment is too hard",
        "agree": 10,
        "disagree": 20
    }
};

var textGlobalSet;
var rectangleClicked = 0;

window.onload = function() {
	// Setup directly from canvas id:
	startDrawing();
}

function startDrawing(json){
	// Creates canvas 320 × 200 at 10, 50
	//var paper = Raphael(400, 50, 320, 200);
	var paper = Raphael(document.getElementById("myCanvas"), 1000, 1000);

	// Creates circle at x = 50, y = 40, with radius 10
	var circle = paper.circle(50, 40, 10);
	// Sets the fill attribute of the circle to red (#f00)
	circle.attr("fill", "#f00");

	// Sets the stroke attribute of the circle to white
	circle.attr("stroke", "#fff");

	// //rectangle as well
	// var rectangle = paper.rect(200, 200, 250, 100);
	// // Sets the stroke attribute of the circle to white
	// rectangle.attr("fill", "#f00");
	// rectangle.attr("stroke", "#000");
	// var text = paper.text(250, 250, 'Assignment1')  
	// text.attr({opacity: 1, 'font-size': 12}).toFront();
	// //click handler
	// rectangle.click(function(event){
	// 	console.log('works');
	// });


	// var rectangle2 = paper.rect(550, 400, 250, 100);
	// // Sets the stroke attribute of the circle to white
	// rectangle2.attr("fill", "#f00");
	// rectangle2.attr("stroke", "#000");


	// var tetronimo = paper.path("M 450 300 l 100 100");  
  
 //    tetronimo.attr({ stroke: '#000', 'stroke-width': 5});

 	//drawRectangles(paper, 5);
 	drawTasks(paper);
}

function drawTasks(paper){
	count = sampleJson.tasks.length;
	
	// max width and height allowed to each rectangle
	overallwidth = 900/count;
	overallheight = 800/count;

	offset = 50;

	//the extra info circle
	var circle = paper.circle(500, 500, 250);
	circle.attr({ opacity:0, fill: '#0f0' });

	$.each(sampleJson.tasks, function(index, task){
		topx = offset + index*overallwidth;
		topy = offset + index*overallheight;

		// wanna extend and save topx and topy ??
		//sampleJson.tasks[index];
		var rectangle = paper.rect(topx, topy, overallwidth-10, overallheight-10);
		// Sets the stroke attribute of the circle to black
		rectangle.attr({"fill": "#f00", "stroke": "#000"});
		rectangle.data("index", index);

		//mouse over task
		rectangle.click(function(event){
			if(rectangleClicked){
				circle.attr({ opacity:0 }).toBack();

				//hide the global set of text
				textGlobalSet.hide();

				rectangleClicked = 0;
			}else{
				circle.attr({ opacity:1 }).toFront();
			
				var index = this.data("index");
				var resources = sampleJson.tasks[index].resources;

				paper.setStart();
				$.each(resources, function(index, resource){
					var hovertext = paper.text(500, 500 + index*12, resource.name);  
					hovertext.attr({opacity: 1, 'font-size': 12}).toFront();
				});
				textGlobalSet = paper.setFinish();
				rectangleClicked = 1;
			}
		});

		// task test
		var text = task.title + ' Difficulty ' + task.difficulty;
		var text = paper.text(topx + offset, topy + offset, text);  
		text.attr({opacity: 1, 'font-size': 12}).toFront();

		if(index < count-1){
			linestartx = topx + overallwidth/2;
			linestarty = topy + overallheight - 10;
			var linePath = "M " + linestartx + " " +  linestarty + "l 0 " + (overallheight/2 + 10) + " l " + (overallwidth/2 + 10) + " 0";
			var tetronimo = paper.path(linePath);  
	  		tetronimo.attr({ stroke: '#000', 'stroke-width': 5});
  		}
	});
}

function drawRectangles(paper, count){
	offset = 50;

	// max width and height allowed to each rectangle
	overallwidth = 1000/count;
	overallheight = 1000/count;

	for(i=0;i<count;i++){
		//rectangle as well
		topx = offset + 200*i;
		topy = offset + 200*i;

		width = 250;
		height = 100;

		var rectangle = paper.rect(topx, topy, width, height);
		// Sets the stroke attribute of the circle to black
		rectangle.attr("fill", "#f00");
		rectangle.attr("stroke", "#000");
		var text = paper.text(topx + offset, topy + offset, 'Assignment' + i)  
		text.attr({opacity: 1, 'font-size': 12}).toFront();
		
		//click handler
		rectangle.click(function(event){
			console.log('works');
		});

		//create path from previous to this rectangle
		if( i != 0){
			topx = offset + 200*(i-1) + width/2;
			topy = offset + 200*(i-1) + height;

			var linePath = "M " + topx + " " +  topy + "l 0 150 l 75 0";
			var tetronimo = paper.path(linePath);  
  			tetronimo.attr({ stroke: '#000', 'stroke-width': 5});
		}
	}
}