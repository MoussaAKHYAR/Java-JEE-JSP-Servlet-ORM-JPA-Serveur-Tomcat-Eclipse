<jsp:include page="../../../header.jsp"></jsp:include>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="row">
		<div class="col-md-8">
		<div class="card">
			<div class="card-header">

				<div class="card-title">Liste des clients</div>
				<div class="card-body">
					<table class="table table-head-bg-primary">
						<thead>
							<tr>
								<th scope="col">#</th>
								<th scope="col">Nom de famille</th>
								<th scope="col">Telephone</th>
								<th scope="col">Village</th>
								<th scope="col">Adresse</th>
								<!-- <th scope="col">Action</th>
								<th scope="col">Action</th> -->
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${clients}" var="client">
								<tr>
									<td>${client.id}</td>
									<td>${client.nomDeFamille}</td>
									<td>${client.telephone}</td>
									<td>${client.village.nomVillage}</td>
									<td>${client.adresse}</td>

									<!-- <td>
										<button class="btn btn-default btn-sm">
											<i class="fa fa-edit"></i> Supprimer
										</button>
									</td>
									<td>
										<button class="btn btn-default btn-sm">
											<i class="fa fa-edit"></i> Editer
										</button>
									</td> -->
								</tr>
							</c:forEach>

						</tbody>
					</table>
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
							<label>Nom</label> <input class="form-control" type="text"
								name="nomDeFamille">
						</div>
						<div class="form-group">
							<label>Télephone</label> <input class="form-control" type="text"
								name="telephone">
						</div>
						<div class="form-group">
							<label>Village</label> <select name="village"
								class="form-control">
								<option value="opt1">Choisir un village</option>
								<c:forEach items="${villages}" var="village">
									<option value="${village.id}">${village.nomVillage}</option>
									<br>
								</c:forEach>
							</select>
						</div>
						<div class="form-group">
							<label>Adresse</label> <input class="form-control" type="text"
								name="adresse">
						</div>
						<div class="form-group">
							<input class="btn btn-success" type="submit" value="Enregistrer" />
						</div>
					</form>
				</div>

			</div>
		</div>

	</div>
</div>
<jsp:include page="../../../footer.jsp"></jsp:include>