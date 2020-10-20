<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../../../header.jsp"></jsp:include>
<div class="row">
	<div class="col-md-8">
		<div class="card">
			<div class="card-header">

				<div class="card-title">Liste des villages</div>
				<div class="card-body">
					<table class="table table-head-bg-primary">
						<thead>
							<tr>
								<th scope="col">#</th>
								<th scope="col">Nom du village</th>
								<th scope="col">Action</th>
								<th scope="col">Action</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${villages}" var="village">
								<tr>
									<td>${village.id}</td>
									<td>${village.nomVillage}</td>

									<td>
										<button class="btn btn-default btn-sm">
											<i class="fa fa-edit"></i> Supprimer
										</button>
									</td>
									<td>
										<button class="btn btn-default btn-sm">
											<i class="fa fa-edit"></i> Editer
										</button>
									</td>
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
				<div class="card-title">Ajouter un village</div>

				<div>
					<form action="Village" method="post">
						<div class="form-group">
							<label>Nom du village</label> <input class="form-control"
								type="text" name="nomVillage">
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