$(document).ready(function () {
    //Multiselect
    $('select.bootstrap-multiple').multiselect({
        buttonClass: 'btn btn-default btn-block btn-flat',
        nonSelectedText: 'Seleccione una opcion...',
        allSelectedText: 'Todas Seleccionadas',
        nSelectedText: ' seleccionadas'
    });

    //Datatables
    $('#main-table').DataTable();
});


function sendForm(){
    $("#guardar").attr('disabled', true);
    $("#alta-user-form").submit();
}