<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Sprint Retro Board</title>
</head>

<body>
Hello World or w'ever.

<div id="sprintRetroBoard">

    <div class="row m-3">
        <div class="p-3 mb-2 bg-danger text-white float-right col m-3">
            <h3>"The orange ones"</h3>
                <div v-for="postit in redPostits" class="card m-1" style="width: 18rem;">
                    <div class="card-body">
                        <h5 class="card-title text-primary">
                            {{postit.owner.forename}}
                        </h5>
                        <p class="card-text text-secondary">
                            {{postit.content}}
                        </p>
                        <a href="#" class="btn btn-primary">Mark as read</a>
                    </div>
                </div>
                <p v-if="redPostits.length == 0">No Cards</p>
        </div>

        <div class="p-3 mb-2 bg-success text-white float-right col m-3">
            <h3>"The Green ones"</h3>
            <div v-for="postit in greenPostits" class="card m-1" style="width: 18rem;">
                <div class="card-body">
                    <h5 class="card-title text-primary">
                        {{postit.owner.forename}}
                    </h5>
                    <p class="card-text text-secondary">
                        {{postit.content}}
                    </p>
                    <a href="#" class="btn btn-primary">Mark as read</a>
                </div>
            </div>
            <p v-if="greenPostits.length == 0">No Cards</p>
        </div>
    </div>

    <div class="row m-3">
        <div class="p-3 mb-2 bg-info text-white col m-3">
            <h3>Actions</h3>
                <ul class="list-group">
                        <li v-for="action in actions" class="list-group-item">
                            <div class="card mb-3" style="max-width: 540px;">
                                <div class="row no-gutters">
                                    <div class="col-md-4">
                                        <input type="checkbox">
                                    </div>
                                    <div class="col-md-8">
                                        <div class="card-body">
                                            <h5 class="card-title text-primary">{{action.owner.forename}}</h5>
                                            <p class="card-text text-secondary">{{action.content}}</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </li>
                </ul>
                <p v-if="actions.length == 0">No Cards</p>
        </div>
    </div>
</div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>

<script>
    const App = new Vue({
        el: '#sprintRetroBoard',

        data: {
            postits: [],
            actions: [],
        },

        computed: {
            redPostits: function() {
                return this.postits.filter(postit => postit.colour == 'RED');
            },
            greenPostits: function() {
                return this.postits.filter(postit => postit.colour == 'GREEN');
            },
        },

        methods: {
            getPostits: function () {
                axios
                    .get('/rest/postit')
                    .then(response => (this.postits = response.data));
            },
            getActions: function () {
                axios
                    .get('/rest/action')
                    .then(response => (this.actions = response.data));
            }
        },

        mounted() {
            this.getPostits();
            this.getActions();
        },
    })

</script>

</body>

</html>