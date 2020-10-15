<jsp:include page="../../../header.jsp"></jsp:include>
<div class="row">
    <div class="col-md-8">
        <div class="card">
            <div class="card-header">
                <div class="card-head-row">
                    <div class="card-title">Liste des clients</div>
                </div>
            </div>
        </div>
    </div>
    <div class="col-md-4">
        <div class="card card-secondary">
            <div class="card-header">
                <div class="card-title">Ajouter un client</div>
                <div class="card-category">Formulaire</div>
                <div>
                    <form action="Client" method="post">
                        <div class="form-group">
                            <label>Nom</label>
                            <input class="form-control" type="text" name="nomDeFamille">
                        </div>
                        <div class="form-group">
                            <label>Télephone</label>
                            <input class="form-control" type="text" name="telephone">
                        </div>
                        <div class="form-group">
                            <label>Village</label>
                            <input  class="form-control"type="text" name="village">
                        </div>
                        <div class="form-group">
                            <label>Adresse</label>
                            <input class="form-control" type="text" name="adresse">
                        </div>
                        <div class="form-group">
                            <input class="btn btn-success" type="submit" value="Enregistrer"/>
                        </div>
                    </form>
                </div>

            </div>
        </div>

    </div>
</div>
<jsp:include page="../../../footer.jsp"></jsp:include>