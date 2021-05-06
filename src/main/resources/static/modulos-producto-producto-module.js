(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["modulos-producto-producto-module"],{

/***/ "GrS3":
/*!*************************************************************!*\
  !*** ./src/app/modulos/producto/producto-routing.module.ts ***!
  \*************************************************************/
/*! exports provided: ProductoRoutingModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ProductoRoutingModule", function() { return ProductoRoutingModule; });
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/router */ "tyNb");
/* harmony import */ var _rutas_ruta_gestion_productos_ruta_gestion_productos_component__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ./rutas/ruta-gestion-productos/ruta-gestion-productos.component */ "ff2o");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/core */ "fXoL");




const routes = [
    {
        path: 'gestion',
        component: _rutas_ruta_gestion_productos_ruta_gestion_productos_component__WEBPACK_IMPORTED_MODULE_1__["RutaGestionProductosComponent"]
    },
    {
        path: '',
        redirectTo: 'gestion'
    }
];
class ProductoRoutingModule {
}
ProductoRoutingModule.ɵmod = _angular_core__WEBPACK_IMPORTED_MODULE_2__["ɵɵdefineNgModule"]({ type: ProductoRoutingModule });
ProductoRoutingModule.ɵinj = _angular_core__WEBPACK_IMPORTED_MODULE_2__["ɵɵdefineInjector"]({ factory: function ProductoRoutingModule_Factory(t) { return new (t || ProductoRoutingModule)(); }, imports: [[_angular_router__WEBPACK_IMPORTED_MODULE_0__["RouterModule"].forChild(routes)], _angular_router__WEBPACK_IMPORTED_MODULE_0__["RouterModule"]] });
(function () { (typeof ngJitMode === "undefined" || ngJitMode) && _angular_core__WEBPACK_IMPORTED_MODULE_2__["ɵɵsetNgModuleScope"](ProductoRoutingModule, { imports: [_angular_router__WEBPACK_IMPORTED_MODULE_0__["RouterModule"]], exports: [_angular_router__WEBPACK_IMPORTED_MODULE_0__["RouterModule"]] }); })();


/***/ }),

/***/ "ff2o":
/*!***************************************************************************************************!*\
  !*** ./src/app/modulos/producto/rutas/ruta-gestion-productos/ruta-gestion-productos.component.ts ***!
  \***************************************************************************************************/
/*! exports provided: RutaGestionProductosComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "RutaGestionProductosComponent", function() { return RutaGestionProductosComponent; });
/* harmony import */ var _constantes_tablas__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! ../../../../constantes/tablas */ "eJOa");
/* harmony import */ var _componentes_modal_crear_editar_producto_modal_crear_editar_producto_component__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../../componentes/modal-crear-editar-producto/modal-crear-editar-producto.component */ "fxtS");
/* harmony import */ var _constantes_skip_take__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../../../../constantes/skip-take */ "WekK");
/* harmony import */ var _funciones_encontrar_indice__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../../../../funciones/encontrar-indice */ "c9Pa");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @angular/core */ "fXoL");
/* harmony import */ var _angular_material_dialog__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! @angular/material/dialog */ "0IaG");
/* harmony import */ var _servicios_cargando_service__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ../../../../servicios/cargando.service */ "WFk5");
/* harmony import */ var ngx_toastr__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ngx-toastr */ "5eHb");
/* harmony import */ var _servicios_rest_producto_rest_service__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! ../../../../servicios/rest/producto-rest.service */ "S6w3");
/* harmony import */ var _angular_material_card__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! @angular/material/card */ "Wp6s");
/* harmony import */ var _componentes_titulo_ruta_titulo_ruta_titulo_ruta_component__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! ../../../../componentes/titulo-ruta/titulo-ruta/titulo-ruta.component */ "nRUH");
/* harmony import */ var _angular_material_form_field__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(/*! @angular/material/form-field */ "kmnG");
/* harmony import */ var _angular_material_input__WEBPACK_IMPORTED_MODULE_12__ = __webpack_require__(/*! @angular/material/input */ "qFsG");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_13__ = __webpack_require__(/*! @angular/forms */ "3Pt+");
/* harmony import */ var _angular_material_icon__WEBPACK_IMPORTED_MODULE_14__ = __webpack_require__(/*! @angular/material/icon */ "NFeN");
/* harmony import */ var _angular_material_button__WEBPACK_IMPORTED_MODULE_15__ = __webpack_require__(/*! @angular/material/button */ "bTqV");
/* harmony import */ var primeng_toolbar__WEBPACK_IMPORTED_MODULE_16__ = __webpack_require__(/*! primeng/toolbar */ "5EWq");
/* harmony import */ var primeng_api__WEBPACK_IMPORTED_MODULE_17__ = __webpack_require__(/*! primeng/api */ "7zfz");
/* harmony import */ var primeng_table__WEBPACK_IMPORTED_MODULE_18__ = __webpack_require__(/*! primeng/table */ "rEr+");
/* harmony import */ var primeng_button__WEBPACK_IMPORTED_MODULE_19__ = __webpack_require__(/*! primeng/button */ "jIHw");
/* harmony import */ var primeng_ripple__WEBPACK_IMPORTED_MODULE_20__ = __webpack_require__(/*! primeng/ripple */ "Q4Mo");
/* harmony import */ var _angular_common__WEBPACK_IMPORTED_MODULE_21__ = __webpack_require__(/*! @angular/common */ "ofXK");
/* harmony import */ var _angular_material_slide_toggle__WEBPACK_IMPORTED_MODULE_22__ = __webpack_require__(/*! @angular/material/slide-toggle */ "1jcm");























function RutaGestionProductosComponent_ng_template_28_Template(rf, ctx) { }
function RutaGestionProductosComponent_ng_template_29_Template(rf, ctx) { if (rf & 1) {
    const _r7 = _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵgetCurrentView"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](0, "button", 23);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵlistener"]("click", function RutaGestionProductosComponent_ng_template_29_Template_button_click_0_listener() { _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵrestoreView"](_r7); const ctx_r6 = _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵnextContext"](); return ctx_r6.abrirModalCrearEditar(); });
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
} }
function RutaGestionProductosComponent_ng_template_31_col_1_Template(rf, ctx) { if (rf & 1) {
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelement"](0, "col");
} if (rf & 2) {
    const col_r10 = ctx.$implicit;
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵclassMap"]("col-width col-width-" + col_r10.width);
} }
function RutaGestionProductosComponent_ng_template_31_Template(rf, ctx) { if (rf & 1) {
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](0, "colgroup");
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtemplate"](1, RutaGestionProductosComponent_ng_template_31_col_1_Template, 1, 2, "col", 24);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
} if (rf & 2) {
    const columns_r8 = ctx.$implicit;
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵadvance"](1);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵproperty"]("ngForOf", columns_r8);
} }
function RutaGestionProductosComponent_ng_template_32_th_1_Template(rf, ctx) { if (rf & 1) {
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](0, "th");
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](1, "div", 26);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](2, "div", 27);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtext"](3);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
} if (rf & 2) {
    const col_r13 = ctx.$implicit;
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵadvance"](3);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtextInterpolate1"](" ", col_r13.header, " ");
} }
function RutaGestionProductosComponent_ng_template_32_Template(rf, ctx) { if (rf & 1) {
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](0, "tr");
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtemplate"](1, RutaGestionProductosComponent_ng_template_32_th_1_Template, 4, 1, "th", 25);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
} if (rf & 2) {
    const columns_r11 = ctx.$implicit;
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵadvance"](1);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵproperty"]("ngForOf", columns_r11);
} }
const _c0 = function (a0, a1) { return { "fondo-cumple": a0, "fondo-no-cumple": a1 }; };
function RutaGestionProductosComponent_ng_template_33_td_1_div_1_Template(rf, ctx) { if (rf & 1) {
    const _r22 = _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵgetCurrentView"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](0, "div");
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](1, "mat-card");
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](2, "div", 29);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](3, "div", 30);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](4, "p", 31);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtext"](5);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](6, "div", 32);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](7, "mat-slide-toggle", 33);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵlistener"]("change", function RutaGestionProductosComponent_ng_template_33_td_1_div_1_Template_mat_slide_toggle_change_7_listener() { _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵrestoreView"](_r22); const producto_r14 = _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵnextContext"](2).$implicit; const ctx_r20 = _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵnextContext"](); return ctx_r20.activarDesactivarRegistro(producto_r14); });
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtext"](8);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](9, "mat-card-content", 34);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](10, "div", 0);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](11, "div", 1);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](12, "div", 0);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](13, "div", 35);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](14, "strong");
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtext"](15, "Informaci\u00F3n producto");
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](16, "div", 1);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](17, "div", 0);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](18, "div", 36);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](19, "strong");
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtext"](20, "C\u00F3digo principal:");
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtext"](21);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](22, "div", 36);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](23, "strong");
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtext"](24, "C\u00F3digo auxiliar:");
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtext"](25);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](26, "div", 37);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](27, "strong");
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtext"](28, "Descripci\u00F3n:");
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtext"](29);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
} if (rf & 2) {
    const producto_r14 = _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵnextContext"](2).$implicit;
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵadvance"](5);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtextInterpolate1"](" ", producto_r14.nombre, "");
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵadvance"](2);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵproperty"]("checked", producto_r14.habilitado);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵadvance"](1);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtextInterpolate1"](" ", producto_r14.habilitado ? "Activo" : "Inactivo", " ");
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵadvance"](1);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵproperty"]("ngClass", _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵpureFunction2"](7, _c0, producto_r14.habilitado, !producto_r14.habilitado));
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵadvance"](12);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtextInterpolate1"](" ", producto_r14.codigo, " ");
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵadvance"](4);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtextInterpolate1"](" ", producto_r14.codigoAuxiliar, " ");
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵadvance"](4);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtextInterpolate1"](" ", producto_r14.descripcion, " ");
} }
function RutaGestionProductosComponent_ng_template_33_td_1_div_2_Template(rf, ctx) { if (rf & 1) {
    const _r26 = _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵgetCurrentView"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](0, "div");
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](1, "div", 14);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](2, "div", 38);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](3, "div", 39);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](4, "button", 40);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵlistener"]("click", function RutaGestionProductosComponent_ng_template_33_td_1_div_2_Template_button_click_4_listener() { _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵrestoreView"](_r26); const producto_r14 = _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵnextContext"](2).$implicit; const ctx_r24 = _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵnextContext"](); return ctx_r24.abrirModalCrearEditar(producto_r14); });
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtext"](5, " Editar ");
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
} if (rf & 2) {
    const producto_r14 = _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵnextContext"](2).$implicit;
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵadvance"](4);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵproperty"]("disabled", !producto_r14.habilitado);
} }
function RutaGestionProductosComponent_ng_template_33_td_1_Template(rf, ctx) { if (rf & 1) {
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](0, "td");
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtemplate"](1, RutaGestionProductosComponent_ng_template_33_td_1_div_1_Template, 30, 10, "div", 28);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtemplate"](2, RutaGestionProductosComponent_ng_template_33_td_1_div_2_Template, 6, 1, "div", 28);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
} if (rf & 2) {
    const col_r17 = ctx.$implicit;
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵadvance"](1);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵproperty"]("ngIf", col_r17.field === "nombre");
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵadvance"](1);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵproperty"]("ngIf", col_r17.field === "id");
} }
function RutaGestionProductosComponent_ng_template_33_Template(rf, ctx) { if (rf & 1) {
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](0, "tr");
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtemplate"](1, RutaGestionProductosComponent_ng_template_33_td_1_Template, 3, 2, "td", 25);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
} if (rf & 2) {
    const columns_r15 = ctx.columns;
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵadvance"](1);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵproperty"]("ngForOf", columns_r15);
} }
function RutaGestionProductosComponent_ng_template_34_Template(rf, ctx) { if (rf & 1) {
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](0, "tr");
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](1, "td", 41);
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtext"](2, "No existen productos. ");
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](3, "strong");
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtext"](4, "Click en nuevo");
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtext"](5, " para crear un producto");
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
} }
class RutaGestionProductosComponent {
    constructor(_dialog, _cargandoService, _toastrService, _productoRestService) {
        this._dialog = _dialog;
        this._cargandoService = _cargandoService;
        this._toastrService = _toastrService;
        this._productoRestService = _productoRestService;
        this.columnasPrimeTable = [
            { field: 'nombre', header: 'Nombre', width: '70' },
            { field: 'id', header: 'Acciones', width: '30' }
        ];
        this.filas = _constantes_tablas__WEBPACK_IMPORTED_MODULE_0__["TABLAS"].rows;
        this.productos = [];
        this.totalProductos = 0;
    }
    ngOnInit() {
    }
    editar(bodega) {
    }
    limpiarFiltroGeneral() {
    }
    cargarDatos(skip, take) {
        this._cargandoService.habilitarCargando();
        let busqueda = {
            skip: skip ? skip : 0,
            take: take ? take : _constantes_skip_take__WEBPACK_IMPORTED_MODULE_2__["PAGINACION"].take,
            busqueda: ''
        };
        if (this.textoBusqueda !== '' && this.textoBusqueda) {
            busqueda.busqueda = this.textoBusqueda;
        }
        this._productoRestService.buscar(busqueda)
            .subscribe((datos) => {
            this._cargandoService.deshabilitarCargando();
            this.productos = datos.listaObjetos;
            this.totalProductos = this.textoBusqueda !== '' ? datos.cantidadRegistros : this.productos.length;
        }, error => {
            this._cargandoService.deshabilitarCargando();
            this._toastrService.error('Ocurrió un error', 'Error');
        });
    }
    cargarMasDatos(evento) {
        this.cargarDatos(evento.first, evento.rows);
    }
    abrirModalCrearEditar(producto) {
        const modalCargarArchivo = this._dialog.open(_componentes_modal_crear_editar_producto_modal_crear_editar_producto_component__WEBPACK_IMPORTED_MODULE_1__["ModalCrearEditarProductoComponent"], {
            data: {
                producto: producto
            }
        });
        modalCargarArchivo.afterClosed()
            .subscribe((r) => this.cargarDatos());
    }
    reiniciarArreglo() {
        this.productos = [];
        this.totalProductos = 0;
    }
    activarDesactivarRegistro(producto) {
        this._cargandoService.habilitarCargando();
        const indice = Object(_funciones_encontrar_indice__WEBPACK_IMPORTED_MODULE_3__["encontrarIndice"])(this.productos, producto);
        const productoActualizar = {
            habilitado: !producto.habilitado,
            idProducto: producto.id
        };
        producto.habilitado = !producto.habilitado;
        this._productoRestService
            .editar(producto, producto.id)
            .subscribe(r => {
            this._cargandoService.deshabilitarCargando();
            this._toastrService.success('Actualizado correctamente', 'Correcto');
            this.productos[indice].habilitado = producto.habilitado;
        }, error => {
            this._toastrService.error('Ocurrió un error', 'Error');
            this._cargandoService.deshabilitarCargando();
            console.error(error);
        });
    }
}
RutaGestionProductosComponent.ɵfac = function RutaGestionProductosComponent_Factory(t) { return new (t || RutaGestionProductosComponent)(_angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵdirectiveInject"](_angular_material_dialog__WEBPACK_IMPORTED_MODULE_5__["MatDialog"]), _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵdirectiveInject"](_servicios_cargando_service__WEBPACK_IMPORTED_MODULE_6__["CargandoService"]), _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵdirectiveInject"](ngx_toastr__WEBPACK_IMPORTED_MODULE_7__["ToastrService"]), _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵdirectiveInject"](_servicios_rest_producto_rest_service__WEBPACK_IMPORTED_MODULE_8__["ProductoRestService"])); };
RutaGestionProductosComponent.ɵcmp = _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵdefineComponent"]({ type: RutaGestionProductosComponent, selectors: [["app-ruta-gestion-productos"]], decls: 35, vars: 12, consts: [[1, "row"], [1, "col-sm-12"], [1, "padding20px"], [3, "mostrarIrAtras", "titulo", "descripcion", "iconoUrl"], [1, "row", "mat-elevation-z8", "padding20px"], [1, "col-md-10"], ["color", "accent"], ["matInput", "", "placeholder", "Ej: 239", 3, "ngModel", "ngModelChange"], [1, "form-text"], [1, "icon-small"], ["mat-raised-button", "", "color", "accent", 1, "paddingLeftRigh10", 3, "click"], [1, "col-md-2"], [1, "paddingTop26px"], ["mat-raised-button", "", "color", "primary", 3, "click"], [1, "mat-elevation-z8"], ["styleClass", "p-mb-4"], ["pTemplate", "left"], ["pTemplate", "right"], ["styleClass", "p-datatable-responsive-demo", 3, "columns", "frozenColumns", "value", "lazy", "paginator", "rows", "totalRecords", "onLazyLoad"], ["pTemplate", "colgroup"], ["pTemplate", "header"], ["pTemplate", "body"], ["pTemplate", "emptymessage"], ["pButton", "", "pRipple", "", "label", "Nuevo", "icon", "pi pi-plus", 1, "p-button-success", "p-mr-2", 3, "click"], [3, "class", 4, "ngFor", "ngForOf"], [4, "ngFor", "ngForOf"], [1, "p-d-flex", "p-jc-between", "p-ai-center"], [1, "text-center"], [4, "ngIf"], [1, "row", "paddinBottom2"], [1, "col-sm-10", "text-center"], [1, "titulo-card-centro"], [1, "col-sm-2", "text-end"], [3, "checked", "change"], [3, "ngClass"], [1, "col-sm-12", "text-center", "paddinBottom2"], [1, "col-sm-6", "text-center", "paddinBottom2"], [1, "col-sm-12", "text-center"], [1, "row", "padding20px"], [1, "col-sm-4", "text-center"], ["mat-raised-button", "", "color", "primary", 3, "disabled", "click"], ["colspan", "8"]], template: function RutaGestionProductosComponent_Template(rf, ctx) { if (rf & 1) {
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](0, "div", 0);
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](1, "div", 1);
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](2, "mat-card");
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](3, "div", 2);
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelement"](4, "app-titulo-ruta", 3);
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelement"](5, "br");
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](6, "div", 4);
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](7, "div", 5);
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](8, "mat-form-field", 6);
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](9, "mat-label");
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtext"](10, "Busque por codigo de nombre o c\u00F3digo*");
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](11, "input", 7);
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵlistener"]("ngModelChange", function RutaGestionProductosComponent_Template_input_ngModelChange_11_listener($event) { return ctx.textoBusqueda = $event; });
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](12, "p", 8);
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](13, "mat-icon", 9);
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtext"](14, "info");
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtext"](15, " Puede buscar los productos por c\u00F3digo o nombre. ");
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](16, "button", 10);
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵlistener"]("click", function RutaGestionProductosComponent_Template_button_click_16_listener() { return ctx.reiniciarArreglo(); })("click", function RutaGestionProductosComponent_Template_button_click_16_listener() { return ctx.cargarDatos(); });
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtext"](17, " Buscar ");
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](18, "mat-icon");
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtext"](19, "search");
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](20, "div", 11);
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](21, "div", 12);
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](22, "button", 13);
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵlistener"]("click", function RutaGestionProductosComponent_Template_button_click_22_listener() { return ctx.textoBusqueda = ""; });
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](23, "mat-icon", 9);
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtext"](24, "cleaning_services");
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelement"](25, "br");
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](26, "div", 14);
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](27, "p-toolbar", 15);
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtemplate"](28, RutaGestionProductosComponent_ng_template_28_Template, 0, 0, "ng-template", 16);
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtemplate"](29, RutaGestionProductosComponent_ng_template_29_Template, 1, 0, "ng-template", 17);
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementStart"](30, "p-table", 18);
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵlistener"]("onLazyLoad", function RutaGestionProductosComponent_Template_p_table_onLazyLoad_30_listener($event) { return ctx.cargarMasDatos($event); });
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtemplate"](31, RutaGestionProductosComponent_ng_template_31_Template, 2, 1, "ng-template", 19);
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtemplate"](32, RutaGestionProductosComponent_ng_template_32_Template, 2, 1, "ng-template", 20);
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtemplate"](33, RutaGestionProductosComponent_ng_template_33_Template, 2, 1, "ng-template", 21);
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵtemplate"](34, RutaGestionProductosComponent_ng_template_34_Template, 6, 0, "ng-template", 22);
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵelementEnd"]();
    } if (rf & 2) {
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵadvance"](4);
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵproperty"]("mostrarIrAtras", true)("titulo", "Gesti\u00F3n de productos")("descripcion", "Gestione el cat\u00E1logo de sus productos")("iconoUrl", "producto.svg");
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵadvance"](7);
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵproperty"]("ngModel", ctx.textoBusqueda);
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵadvance"](19);
        _angular_core__WEBPACK_IMPORTED_MODULE_4__["ɵɵproperty"]("columns", ctx.columnasPrimeTable)("frozenColumns", ctx.columnasPrimeTable)("value", ctx.productos)("lazy", true)("paginator", true)("rows", ctx.filas)("totalRecords", ctx.totalProductos);
    } }, directives: [_angular_material_card__WEBPACK_IMPORTED_MODULE_9__["MatCard"], _componentes_titulo_ruta_titulo_ruta_titulo_ruta_component__WEBPACK_IMPORTED_MODULE_10__["TituloRutaComponent"], _angular_material_form_field__WEBPACK_IMPORTED_MODULE_11__["MatFormField"], _angular_material_form_field__WEBPACK_IMPORTED_MODULE_11__["MatLabel"], _angular_material_input__WEBPACK_IMPORTED_MODULE_12__["MatInput"], _angular_forms__WEBPACK_IMPORTED_MODULE_13__["DefaultValueAccessor"], _angular_forms__WEBPACK_IMPORTED_MODULE_13__["NgControlStatus"], _angular_forms__WEBPACK_IMPORTED_MODULE_13__["NgModel"], _angular_material_icon__WEBPACK_IMPORTED_MODULE_14__["MatIcon"], _angular_material_button__WEBPACK_IMPORTED_MODULE_15__["MatButton"], primeng_toolbar__WEBPACK_IMPORTED_MODULE_16__["Toolbar"], primeng_api__WEBPACK_IMPORTED_MODULE_17__["PrimeTemplate"], primeng_table__WEBPACK_IMPORTED_MODULE_18__["Table"], primeng_button__WEBPACK_IMPORTED_MODULE_19__["ButtonDirective"], primeng_ripple__WEBPACK_IMPORTED_MODULE_20__["Ripple"], _angular_common__WEBPACK_IMPORTED_MODULE_21__["NgForOf"], _angular_common__WEBPACK_IMPORTED_MODULE_21__["NgIf"], _angular_material_slide_toggle__WEBPACK_IMPORTED_MODULE_22__["MatSlideToggle"], _angular_material_card__WEBPACK_IMPORTED_MODULE_9__["MatCardContent"], _angular_common__WEBPACK_IMPORTED_MODULE_21__["NgClass"]], styles: ["\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJydXRhLWdlc3Rpb24tcHJvZHVjdG9zLmNvbXBvbmVudC5zY3NzIn0= */"] });


/***/ }),

/***/ "fxtS":
/*!*******************************************************************************************************************!*\
  !*** ./src/app/modulos/producto/componentes/modal-crear-editar-producto/modal-crear-editar-producto.component.ts ***!
  \*******************************************************************************************************************/
/*! exports provided: ModalCrearEditarProductoComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ModalCrearEditarProductoComponent", function() { return ModalCrearEditarProductoComponent; });
/* harmony import */ var _angular_material_dialog__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/material/dialog */ "0IaG");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "fXoL");
/* harmony import */ var _servicios_rest_producto_rest_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../../../../servicios/rest/producto-rest.service */ "S6w3");
/* harmony import */ var _servicios_cargando_service__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../../../../servicios/cargando.service */ "WFk5");
/* harmony import */ var ngx_toastr__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ngx-toastr */ "5eHb");
/* harmony import */ var _formulario_producto_formulario_producto_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ../formulario-producto/formulario-producto.component */ "nqDZ");
/* harmony import */ var _angular_material_button__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! @angular/material/button */ "bTqV");








class ModalCrearEditarProductoComponent {
    constructor(data, _productoRestService, _cargandoService, _toastrService, _dialog) {
        this.data = data;
        this._productoRestService = _productoRestService;
        this._cargandoService = _cargandoService;
        this._toastrService = _toastrService;
        this._dialog = _dialog;
    }
    ngOnInit() {
    }
    guardarRegistro() {
        var _a;
        this._cargandoService.habilitarCargando();
        if (this.data.producto) {
            // @ts-ignore
            this.productoACrear.id = this.data.producto.id;
            // @ts-ignore
            (_a = this.productoACrear) === null || _a === void 0 ? void 0 : _a.habilitado = this.data.producto.habilitado;
            this._productoRestService
                .editar(this.productoACrear, this.data.producto.id)
                .subscribe(creado => {
                this._cargandoService.deshabilitarCargando();
                this._toastrService.success('Se actualizó correctamente');
                this._dialog.closeAll();
            }, error => {
                console.error({
                    error
                });
                this._cargandoService.deshabilitarCargando();
                this._toastrService.error('Ocurrió un error', 'Error');
            });
        }
        else {
            if (this.productoACrear) {
                this.productoACrear.habilitado = true;
                this._productoRestService
                    .crear(this.productoACrear)
                    .subscribe(creado => {
                    this._cargandoService.deshabilitarCargando();
                    this._toastrService.success('Se creó correctamente');
                    this._dialog.closeAll();
                }, error => {
                    console.error({
                        error
                    });
                    this._cargandoService.deshabilitarCargando();
                    this._toastrService.error('Ocurrió un error', 'Error');
                });
            }
        }
    }
    setearProducto(producto) {
        this.productoACrear = producto;
    }
}
ModalCrearEditarProductoComponent.ɵfac = function ModalCrearEditarProductoComponent_Factory(t) { return new (t || ModalCrearEditarProductoComponent)(_angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵdirectiveInject"](_angular_material_dialog__WEBPACK_IMPORTED_MODULE_0__["MAT_DIALOG_DATA"]), _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵdirectiveInject"](_servicios_rest_producto_rest_service__WEBPACK_IMPORTED_MODULE_2__["ProductoRestService"]), _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵdirectiveInject"](_servicios_cargando_service__WEBPACK_IMPORTED_MODULE_3__["CargandoService"]), _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵdirectiveInject"](ngx_toastr__WEBPACK_IMPORTED_MODULE_4__["ToastrService"]), _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵdirectiveInject"](_angular_material_dialog__WEBPACK_IMPORTED_MODULE_0__["MatDialog"])); };
ModalCrearEditarProductoComponent.ɵcmp = _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵdefineComponent"]({ type: ModalCrearEditarProductoComponent, selectors: [["app-modal-crear-editar-producto"]], decls: 9, vars: 4, consts: [["mat-dialog-title", ""], ["mat-dialog-content", ""], [3, "producto", "formularioEmitter"], ["mat-dialog-actions", ""], ["mat-button", "", "mat-raised-button", "", "color", "primary", 3, "disabled", "click"], ["mat-button", "", "mat-dialog-close", "", "mat-raised-button", "", "color", "accent"]], template: function ModalCrearEditarProductoComponent_Template(rf, ctx) { if (rf & 1) {
        _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵelementStart"](0, "h1", 0);
        _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵtext"](1);
        _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵelementStart"](2, "div", 1);
        _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵelementStart"](3, "app-formulario-producto", 2);
        _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵlistener"]("formularioEmitter", function ModalCrearEditarProductoComponent_Template_app_formulario_producto_formularioEmitter_3_listener($event) { return ctx.setearProducto($event); });
        _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵelementStart"](4, "div", 3);
        _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵelementStart"](5, "button", 4);
        _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵlistener"]("click", function ModalCrearEditarProductoComponent_Template_button_click_5_listener() { return ctx.guardarRegistro(); });
        _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵtext"](6);
        _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵelementStart"](7, "button", 5);
        _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵtext"](8, "Cancelar");
        _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵelementEnd"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵelementEnd"]();
    } if (rf & 2) {
        _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵadvance"](1);
        _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵtextInterpolate1"]("", ctx.data.producto ? "Editar" : "Crear", " Producto");
        _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵadvance"](2);
        _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵproperty"]("producto", ctx.data.producto);
        _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵadvance"](2);
        _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵproperty"]("disabled", !ctx.productoACrear);
        _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵadvance"](1);
        _angular_core__WEBPACK_IMPORTED_MODULE_1__["ɵɵtextInterpolate"](ctx.data.producto ? "Guardar cambios" : "Guardar");
    } }, directives: [_angular_material_dialog__WEBPACK_IMPORTED_MODULE_0__["MatDialogTitle"], _angular_material_dialog__WEBPACK_IMPORTED_MODULE_0__["MatDialogContent"], _formulario_producto_formulario_producto_component__WEBPACK_IMPORTED_MODULE_5__["FormularioProductoComponent"], _angular_material_dialog__WEBPACK_IMPORTED_MODULE_0__["MatDialogActions"], _angular_material_button__WEBPACK_IMPORTED_MODULE_6__["MatButton"], _angular_material_dialog__WEBPACK_IMPORTED_MODULE_0__["MatDialogClose"]], styles: ["\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJtb2RhbC1jcmVhci1lZGl0YXItcHJvZHVjdG8uY29tcG9uZW50LnNjc3MifQ== */"] });


/***/ }),

/***/ "ijNl":
/*!*****************************************************!*\
  !*** ./src/app/modulos/producto/producto.module.ts ***!
  \*****************************************************/
/*! exports provided: ProductoModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ProductoModule", function() { return ProductoModule; });
/* harmony import */ var _angular_common__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/common */ "ofXK");
/* harmony import */ var _producto_routing_module__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ./producto-routing.module */ "GrS3");
/* harmony import */ var _rutas_ruta_gestion_productos_ruta_gestion_productos_component__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./rutas/ruta-gestion-productos/ruta-gestion-productos.component */ "ff2o");
/* harmony import */ var _componentes_modal_crear_editar_producto_modal_crear_editar_producto_component__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./componentes/modal-crear-editar-producto/modal-crear-editar-producto.component */ "fxtS");
/* harmony import */ var _componentes_formulario_producto_formulario_producto_component__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./componentes/formulario-producto/formulario-producto.component */ "nqDZ");
/* harmony import */ var _constantes_modulos_comunes__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ../../constantes/modulos-comunes */ "vbRb");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! @angular/forms */ "3Pt+");
/* harmony import */ var _componentes_detalles_adicionales_detalles_adicionales_component__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ./componentes/detalles-adicionales/detalles-adicionales.component */ "k+4H");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! @angular/core */ "fXoL");
/* harmony import */ var _angular_material_card__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! @angular/material/card */ "Wp6s");
/* harmony import */ var _componentes_titulo_ruta_titulo_ruta_module__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! ../../componentes/titulo-ruta/titulo-ruta.module */ "sspE");
/* harmony import */ var primeng_table__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(/*! primeng/table */ "rEr+");
/* harmony import */ var _angular_material_form_field__WEBPACK_IMPORTED_MODULE_12__ = __webpack_require__(/*! @angular/material/form-field */ "kmnG");
/* harmony import */ var _angular_material_button__WEBPACK_IMPORTED_MODULE_13__ = __webpack_require__(/*! @angular/material/button */ "bTqV");
/* harmony import */ var primeng_button__WEBPACK_IMPORTED_MODULE_14__ = __webpack_require__(/*! primeng/button */ "jIHw");
/* harmony import */ var primeng_ripple__WEBPACK_IMPORTED_MODULE_15__ = __webpack_require__(/*! primeng/ripple */ "Q4Mo");
/* harmony import */ var primeng_toolbar__WEBPACK_IMPORTED_MODULE_16__ = __webpack_require__(/*! primeng/toolbar */ "5EWq");
/* harmony import */ var _angular_material_dialog__WEBPACK_IMPORTED_MODULE_17__ = __webpack_require__(/*! @angular/material/dialog */ "0IaG");
/* harmony import */ var _angular_material_input__WEBPACK_IMPORTED_MODULE_18__ = __webpack_require__(/*! @angular/material/input */ "qFsG");
/* harmony import */ var _angular_material_icon__WEBPACK_IMPORTED_MODULE_19__ = __webpack_require__(/*! @angular/material/icon */ "NFeN");
/* harmony import */ var _angular_material_slide_toggle__WEBPACK_IMPORTED_MODULE_20__ = __webpack_require__(/*! @angular/material/slide-toggle */ "1jcm");
/* harmony import */ var _pipes_activo_inactivo_pipe_activo_inactivo_pipe_module__WEBPACK_IMPORTED_MODULE_21__ = __webpack_require__(/*! ../../pipes/activo-inactivo-pipe/activo-inactivo-pipe.module */ "kg3b");
/* harmony import */ var _pipes_estado_mantenimiento_pipe_estado_mantenimiento_pipe_module__WEBPACK_IMPORTED_MODULE_22__ = __webpack_require__(/*! ../../pipes/estado-mantenimiento-pipe/estado-mantenimiento-pipe.module */ "LYaL");
/* harmony import */ var _angular_material_button_toggle__WEBPACK_IMPORTED_MODULE_23__ = __webpack_require__(/*! @angular/material/button-toggle */ "jaxi");
/* harmony import */ var _angular_material_select__WEBPACK_IMPORTED_MODULE_24__ = __webpack_require__(/*! @angular/material/select */ "d3UM");
/* harmony import */ var primeng_calendar__WEBPACK_IMPORTED_MODULE_25__ = __webpack_require__(/*! primeng/calendar */ "eO1q");
/* harmony import */ var _componentes_seleccionar_producto_seleccionar_producto_module__WEBPACK_IMPORTED_MODULE_26__ = __webpack_require__(/*! ../../componentes/seleccionar-producto/seleccionar-producto.module */ "qeg7");
/* harmony import */ var _angular_material_core__WEBPACK_IMPORTED_MODULE_27__ = __webpack_require__(/*! @angular/material/core */ "FKr1");
/* harmony import */ var _angular_material_autocomplete__WEBPACK_IMPORTED_MODULE_28__ = __webpack_require__(/*! @angular/material/autocomplete */ "/1cH");
/* harmony import */ var primeng_inputtext__WEBPACK_IMPORTED_MODULE_29__ = __webpack_require__(/*! primeng/inputtext */ "7kUa");































class ProductoModule {
}
ProductoModule.ɵmod = _angular_core__WEBPACK_IMPORTED_MODULE_8__["ɵɵdefineNgModule"]({ type: ProductoModule });
ProductoModule.ɵinj = _angular_core__WEBPACK_IMPORTED_MODULE_8__["ɵɵdefineInjector"]({ factory: function ProductoModule_Factory(t) { return new (t || ProductoModule)(); }, imports: [[
            _angular_common__WEBPACK_IMPORTED_MODULE_0__["CommonModule"],
            _producto_routing_module__WEBPACK_IMPORTED_MODULE_1__["ProductoRoutingModule"],
            ..._constantes_modulos_comunes__WEBPACK_IMPORTED_MODULE_5__["MODULOS_COMUNES"],
            _angular_forms__WEBPACK_IMPORTED_MODULE_6__["ReactiveFormsModule"]
        ]] });
(function () { (typeof ngJitMode === "undefined" || ngJitMode) && _angular_core__WEBPACK_IMPORTED_MODULE_8__["ɵɵsetNgModuleScope"](ProductoModule, { declarations: [_rutas_ruta_gestion_productos_ruta_gestion_productos_component__WEBPACK_IMPORTED_MODULE_2__["RutaGestionProductosComponent"], _componentes_modal_crear_editar_producto_modal_crear_editar_producto_component__WEBPACK_IMPORTED_MODULE_3__["ModalCrearEditarProductoComponent"], _componentes_formulario_producto_formulario_producto_component__WEBPACK_IMPORTED_MODULE_4__["FormularioProductoComponent"], _componentes_detalles_adicionales_detalles_adicionales_component__WEBPACK_IMPORTED_MODULE_7__["DetallesAdicionalesComponent"]], imports: [_angular_common__WEBPACK_IMPORTED_MODULE_0__["CommonModule"],
        _producto_routing_module__WEBPACK_IMPORTED_MODULE_1__["ProductoRoutingModule"], _angular_material_card__WEBPACK_IMPORTED_MODULE_9__["MatCardModule"], _componentes_titulo_ruta_titulo_ruta_module__WEBPACK_IMPORTED_MODULE_10__["TituloRutaModule"], primeng_table__WEBPACK_IMPORTED_MODULE_11__["TableModule"], _angular_material_form_field__WEBPACK_IMPORTED_MODULE_12__["MatFormFieldModule"], _angular_material_button__WEBPACK_IMPORTED_MODULE_13__["MatButtonModule"], primeng_button__WEBPACK_IMPORTED_MODULE_14__["ButtonModule"], primeng_ripple__WEBPACK_IMPORTED_MODULE_15__["RippleModule"], primeng_toolbar__WEBPACK_IMPORTED_MODULE_16__["ToolbarModule"], _angular_material_dialog__WEBPACK_IMPORTED_MODULE_17__["MatDialogModule"], _angular_material_input__WEBPACK_IMPORTED_MODULE_18__["MatInputModule"], _angular_material_icon__WEBPACK_IMPORTED_MODULE_19__["MatIconModule"], _angular_material_slide_toggle__WEBPACK_IMPORTED_MODULE_20__["MatSlideToggleModule"], _angular_forms__WEBPACK_IMPORTED_MODULE_6__["FormsModule"], _angular_forms__WEBPACK_IMPORTED_MODULE_6__["ReactiveFormsModule"], _pipes_activo_inactivo_pipe_activo_inactivo_pipe_module__WEBPACK_IMPORTED_MODULE_21__["ActivoInactivoPipeModule"], _pipes_estado_mantenimiento_pipe_estado_mantenimiento_pipe_module__WEBPACK_IMPORTED_MODULE_22__["EstadoMantenimientoPipeModule"], _angular_material_button_toggle__WEBPACK_IMPORTED_MODULE_23__["MatButtonToggleModule"], _angular_material_select__WEBPACK_IMPORTED_MODULE_24__["MatSelectModule"], primeng_calendar__WEBPACK_IMPORTED_MODULE_25__["CalendarModule"], _componentes_seleccionar_producto_seleccionar_producto_module__WEBPACK_IMPORTED_MODULE_26__["SeleccionarProductoModule"], _angular_material_core__WEBPACK_IMPORTED_MODULE_27__["MatOptionModule"], _angular_material_autocomplete__WEBPACK_IMPORTED_MODULE_28__["MatAutocompleteModule"], primeng_inputtext__WEBPACK_IMPORTED_MODULE_29__["InputTextModule"], _angular_forms__WEBPACK_IMPORTED_MODULE_6__["ReactiveFormsModule"]] }); })();


/***/ }),

/***/ "k+4H":
/*!*****************************************************************************************************!*\
  !*** ./src/app/modulos/producto/componentes/detalles-adicionales/detalles-adicionales.component.ts ***!
  \*****************************************************************************************************/
/*! exports provided: DetallesAdicionalesComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "DetallesAdicionalesComponent", function() { return DetallesAdicionalesComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "fXoL");

class DetallesAdicionalesComponent {
    constructor() { }
    ngOnInit() {
    }
}
DetallesAdicionalesComponent.ɵfac = function DetallesAdicionalesComponent_Factory(t) { return new (t || DetallesAdicionalesComponent)(); };
DetallesAdicionalesComponent.ɵcmp = _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵdefineComponent"]({ type: DetallesAdicionalesComponent, selectors: [["app-detalles-adicionales"]], decls: 2, vars: 0, template: function DetallesAdicionalesComponent_Template(rf, ctx) { if (rf & 1) {
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "p");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](1, "detalles-adicionales works!");
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    } }, styles: ["\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJkZXRhbGxlcy1hZGljaW9uYWxlcy5jb21wb25lbnQuc2NzcyJ9 */"] });


/***/ }),

/***/ "nqDZ":
/*!***************************************************************************************************!*\
  !*** ./src/app/modulos/producto/componentes/formulario-producto/formulario-producto.component.ts ***!
  \***************************************************************************************************/
/*! exports provided: FormularioProductoComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FormularioProductoComponent", function() { return FormularioProductoComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "fXoL");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/forms */ "3Pt+");
/* harmony import */ var _bodega_constantes_mensajes_validacion__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../../../bodega/constantes/mensajes-validacion */ "Obj7");
/* harmony import */ var rxjs_operators__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! rxjs/operators */ "kU1M");
/* harmony import */ var _angular_common__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @angular/common */ "ofXK");
/* harmony import */ var _angular_material_form_field__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! @angular/material/form-field */ "kmnG");
/* harmony import */ var _angular_material_input__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! @angular/material/input */ "qFsG");









function FormularioProductoComponent_div_0_div_11_div_1_Template(rf, ctx) { if (rf & 1) {
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "div");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](1, "mat-error");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](2, "p");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](3);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
} if (rf & 2) {
    const mensaje_r6 = ctx.$implicit;
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](3);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtextInterpolate"](mensaje_r6);
} }
function FormularioProductoComponent_div_0_div_11_Template(rf, ctx) { if (rf & 1) {
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "div");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtemplate"](1, FormularioProductoComponent_div_0_div_11_div_1_Template, 4, 1, "div", 10);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
} if (rf & 2) {
    const ctx_r1 = _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵnextContext"](2);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](1);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("ngForOf", ctx_r1.mensajesErrorNombre);
} }
function FormularioProductoComponent_div_0_div_20_div_1_Template(rf, ctx) { if (rf & 1) {
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "div");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](1, "mat-error");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](2, "p");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](3);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
} if (rf & 2) {
    const mensaje_r8 = ctx.$implicit;
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](3);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtextInterpolate"](mensaje_r8);
} }
function FormularioProductoComponent_div_0_div_20_Template(rf, ctx) { if (rf & 1) {
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "div");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtemplate"](1, FormularioProductoComponent_div_0_div_20_div_1_Template, 4, 1, "div", 10);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
} if (rf & 2) {
    const ctx_r2 = _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵnextContext"](2);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](1);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("ngForOf", ctx_r2.mensajesErrorCodigo);
} }
function FormularioProductoComponent_div_0_div_29_div_1_Template(rf, ctx) { if (rf & 1) {
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "div");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](1, "mat-error");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](2, "p");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](3);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
} if (rf & 2) {
    const mensaje_r10 = ctx.$implicit;
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](3);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtextInterpolate"](mensaje_r10);
} }
function FormularioProductoComponent_div_0_div_29_Template(rf, ctx) { if (rf & 1) {
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "div");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtemplate"](1, FormularioProductoComponent_div_0_div_29_div_1_Template, 4, 1, "div", 10);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
} if (rf & 2) {
    const ctx_r3 = _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵnextContext"](2);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](1);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("ngForOf", ctx_r3.mensajesErrorCodigo);
} }
function FormularioProductoComponent_div_0_div_38_div_1_Template(rf, ctx) { if (rf & 1) {
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "div");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](1, "mat-error");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](2, "p");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](3);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
} if (rf & 2) {
    const mensaje_r12 = ctx.$implicit;
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](3);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtextInterpolate"](mensaje_r12);
} }
function FormularioProductoComponent_div_0_div_38_Template(rf, ctx) { if (rf & 1) {
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "div");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtemplate"](1, FormularioProductoComponent_div_0_div_38_div_1_Template, 4, 1, "div", 10);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
} if (rf & 2) {
    const ctx_r4 = _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵnextContext"](2);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](1);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("ngForOf", ctx_r4.mensajesErrorDescripcion);
} }
const _c0 = function (a0, a1) { return { "is-valid": a0, "is-invalid": a1 }; };
function FormularioProductoComponent_div_0_Template(rf, ctx) { if (rf & 1) {
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](0, "div");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](1, "form", 1);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](2, "div", 2);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](3, "div", 3);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](4, "div", 4);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](5, "mat-form-field");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](6, "mat-label");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](7, "Nombre");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](8, "input", 5);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](9, "mat-hint");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](10, "Ingrese un nombre");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtemplate"](11, FormularioProductoComponent_div_0_div_11_Template, 2, 1, "div", 0);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](12, "div", 6);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](13, "div", 4);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](14, "mat-form-field");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](15, "mat-label");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](16, "C\u00F3digo");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](17, "input", 7);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](18, "mat-hint");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](19, "Ingrese un c\u00F3digo");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtemplate"](20, FormularioProductoComponent_div_0_div_20_Template, 2, 1, "div", 0);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](21, "div", 6);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](22, "div", 4);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](23, "mat-form-field");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](24, "mat-label");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](25, "C\u00F3digo auxiliar");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](26, "input", 8);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](27, "mat-hint");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](28, "Ingrese un c\u00F3digo");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtemplate"](29, FormularioProductoComponent_div_0_div_29_Template, 2, 1, "div", 0);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](30, "div", 3);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](31, "div", 4);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](32, "mat-form-field");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](33, "mat-label");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](34, "Descripci\u00F3n");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelement"](35, "textarea", 9);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementStart"](36, "mat-hint");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtext"](37, "Ingrese una descripci\u00F3n");
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtemplate"](38, FormularioProductoComponent_div_0_div_38_Template, 2, 1, "div", 0);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵprojection"](39);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵelementEnd"]();
} if (rf & 2) {
    const ctx_r0 = _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵnextContext"]();
    let tmp_1_0 = null;
    let tmp_3_0 = null;
    let tmp_5_0 = null;
    let tmp_7_0 = null;
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](1);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("formGroup", ctx_r0.formularioProducto);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](7);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("ngClass", _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵpureFunction2"](9, _c0, ctx_r0.mensajesErrorNombre.length === 0 && (ctx_r0.formularioProducto == null ? null : (tmp_1_0 = ctx_r0.formularioProducto.get("nombre")) == null ? null : tmp_1_0.value), ctx_r0.mensajesErrorNombre.length > 0));
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](3);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("ngIf", ctx_r0.mensajesErrorNombre.length > 0);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](6);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("ngClass", _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵpureFunction2"](12, _c0, ctx_r0.mensajesErrorCodigo.length === 0 && (ctx_r0.formularioProducto == null ? null : (tmp_3_0 = ctx_r0.formularioProducto.get("codigo")) == null ? null : tmp_3_0.value), ctx_r0.mensajesErrorCodigo.length > 0));
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](3);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("ngIf", ctx_r0.mensajesErrorCodigo.length > 0);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](6);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("ngClass", _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵpureFunction2"](15, _c0, ctx_r0.mensajesErrorCodigoAuxiliar.length === 0 && (ctx_r0.formularioProducto == null ? null : (tmp_5_0 = ctx_r0.formularioProducto.get("codigoAuxiliar")) == null ? null : tmp_5_0.value), ctx_r0.mensajesErrorCodigoAuxiliar.length > 0));
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](3);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("ngIf", ctx_r0.mensajesErrorCodigoAuxiliar.length > 0);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](6);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("ngClass", _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵpureFunction2"](18, _c0, ctx_r0.mensajesErrorDescripcion.length === 0 && (ctx_r0.formularioProducto == null ? null : (tmp_7_0 = ctx_r0.formularioProducto.get("descripcion")) == null ? null : tmp_7_0.value), ctx_r0.mensajesErrorDescripcion.length > 0));
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵadvance"](3);
    _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("ngIf", ctx_r0.mensajesErrorDescripcion.length > 0);
} }
const _c1 = ["*"];
class FormularioProductoComponent {
    constructor(_formBuilder) {
        this._formBuilder = _formBuilder;
        this.formularioValido = false;
        this.mensajesErrorNombre = [];
        this.mensajesErrorCodigo = [];
        this.mensajesErrorCodigoAuxiliar = [];
        this.mensajesErrorDescripcion = [];
        this._mensajesValidacionNombre = _bodega_constantes_mensajes_validacion__WEBPACK_IMPORTED_MODULE_2__["MENSAJES_VALIDACION_NOMBRE"];
        this._mensajesValidacionCodigo = _bodega_constantes_mensajes_validacion__WEBPACK_IMPORTED_MODULE_2__["MENSAJES_VALIDACION_CODIGO"];
        this._mensajesValidacionCodigoAuxiliar = _bodega_constantes_mensajes_validacion__WEBPACK_IMPORTED_MODULE_2__["MENSAJES_VALIDACION_CODIGO_AUXILIAR"];
        this._mensajesValidacionDescripcion = _bodega_constantes_mensajes_validacion__WEBPACK_IMPORTED_MODULE_2__["MENSAJES_VALIDACION_DESCRIPCION"];
        this.subscriptores = [];
        this.formularioEmitter = new _angular_core__WEBPACK_IMPORTED_MODULE_0__["EventEmitter"]();
    }
    ngOnInit() {
        this.iniciarFormulario();
        this._escucharFormulario();
        this._escucharCampoNombre();
        this._escucharCampoCodigo();
        this._escucharCampoCodigoAuxiliar();
        this._escucharCampoDescripcion();
    }
    ngOnDestroy() {
        this.subscriptores.forEach(valor => valor.unsubscribe());
    }
    iniciarFormulario() {
        this.formularioProducto = this._formBuilder.group({
            nombre: [this.producto ? this.producto.nombre : '',
                [
                    _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].required,
                    _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].minLength(3),
                    _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].maxLength(100),
                ],
            ],
            codigo: [this.producto ? this.producto.codigo : '',
                [
                    _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].required,
                    _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].minLength(3),
                    _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].maxLength(10),
                ],
            ],
            codigoAuxiliar: [this.producto ? this.producto.codigoAuxiliar : '',
                [
                    _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].required,
                    _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].minLength(3),
                    _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].maxLength(10),
                ],
            ],
            descripcion: [this.producto ? this.producto.descripcion : '',
                [
                    _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].required,
                    _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].minLength(3),
                    _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].maxLength(250),
                ],
            ],
        });
    }
    _escucharFormulario() {
        // el observable que escucha cambios
        if (this.formularioProducto) {
            const observableCambiosFormulario$ = this.formularioProducto.valueChanges;
            const observableFOmrulario = observableCambiosFormulario$
                .subscribe((formulario) => {
                var _a;
                // console.log('escuchando cambios formulario', formulario)
                if ((_a = this.formularioProducto) === null || _a === void 0 ? void 0 : _a.valid) {
                    this.formularioEmitter.emit(formulario);
                }
                else {
                    this.formularioEmitter.emit(undefined);
                }
            });
            this.subscriptores.push(observableFOmrulario);
        }
    }
    _escucharCampoNombre() {
        var _a;
        const controlNombre = (_a = this.formularioProducto) === null || _a === void 0 ? void 0 : _a.get('nombre');
        const observableDeCambiosNombre$ = controlNombre.valueChanges;
        const respuestaObservableNombre = observableDeCambiosNombre$
            .pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_3__["debounceTime"])(1000))
            .subscribe((respuesta) => {
            this._setearMensajesNombre(controlNombre);
        });
        this.subscriptores.push(respuestaObservableNombre);
    }
    _setearMensajesNombre(controlForm) {
        this.mensajesErrorNombre = [];
        const tieneErrores = (controlForm.dirty || controlForm.touched) && controlForm.errors;
        if (tieneErrores) {
            const errores = controlForm.errors;
            this.mensajesErrorNombre = Object.keys(errores)
                .map((atributo) => {
                const mensajeError = atributo;
                return this._mensajesValidacionNombre[mensajeError];
            });
        }
    }
    _escucharCampoCodigo() {
        var _a;
        const controlCodigo = (_a = this.formularioProducto) === null || _a === void 0 ? void 0 : _a.get('codigo');
        const observableDeCambiosCodigo$ = controlCodigo.valueChanges;
        const respuestaObservableCodigo = observableDeCambiosCodigo$
            .pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_3__["debounceTime"])(1000))
            .subscribe((respuesta) => {
            this._setearMensajesCodigo(controlCodigo);
        });
        this.subscriptores.push(respuestaObservableCodigo);
    }
    _setearMensajesCodigo(controlForm) {
        this.mensajesErrorCodigo = [];
        const tieneErrores = (controlForm.dirty || controlForm.touched) && controlForm.errors;
        if (tieneErrores) {
            const errores = controlForm.errors;
            this.mensajesErrorCodigo = Object.keys(errores)
                .map((atributo) => {
                const mensajeError = atributo;
                return this._mensajesValidacionCodigo[mensajeError];
            });
        }
    }
    _escucharCampoCodigoAuxiliar() {
        var _a;
        const controlCodigoAuxiliar = (_a = this.formularioProducto) === null || _a === void 0 ? void 0 : _a.get('codigoAuxiliar');
        const observableDeCambiosCodigoAuxiliar$ = controlCodigoAuxiliar.valueChanges;
        const respuestaObservableCodigoAuxiliar = observableDeCambiosCodigoAuxiliar$
            .pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_3__["debounceTime"])(1000))
            .subscribe((respuesta) => {
            this._setearMensajesCodigoAuxiliar(controlCodigoAuxiliar);
        });
        this.subscriptores.push(respuestaObservableCodigoAuxiliar);
    }
    _setearMensajesCodigoAuxiliar(controlForm) {
        this.mensajesErrorCodigoAuxiliar = [];
        const tieneErrores = (controlForm.dirty || controlForm.touched) && controlForm.errors;
        if (tieneErrores) {
            const errores = controlForm.errors;
            this.mensajesErrorCodigo = Object.keys(errores)
                .map((atributo) => {
                const mensajeError = atributo;
                return this._mensajesValidacionCodigoAuxiliar[mensajeError];
            });
        }
    }
    _escucharCampoDescripcion() {
        var _a;
        const controlDescripcion = (_a = this.formularioProducto) === null || _a === void 0 ? void 0 : _a.get('descripcion');
        const observableDeCambiosDescriocion$ = controlDescripcion.valueChanges;
        const respuestaObservableDescripcion = observableDeCambiosDescriocion$
            .pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_3__["debounceTime"])(1000))
            .subscribe((respuesta) => {
            this._setearMensajesDescripcion(controlDescripcion);
        });
        this.subscriptores.push(respuestaObservableDescripcion);
    }
    _setearMensajesDescripcion(controlForm) {
        this.mensajesErrorDescripcion = [];
        const tieneErrores = (controlForm.dirty || controlForm.touched) && controlForm.errors;
        if (tieneErrores) {
            const errores = controlForm.errors;
            this.mensajesErrorDescripcion = Object.keys(errores)
                .map((atributo) => {
                const mensajeError = atributo;
                return this._mensajesValidacionDescripcion[mensajeError];
            });
        }
    }
}
FormularioProductoComponent.ɵfac = function FormularioProductoComponent_Factory(t) { return new (t || FormularioProductoComponent)(_angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵdirectiveInject"](_angular_forms__WEBPACK_IMPORTED_MODULE_1__["FormBuilder"])); };
FormularioProductoComponent.ɵcmp = _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵdefineComponent"]({ type: FormularioProductoComponent, selectors: [["app-formulario-producto"]], inputs: { producto: "producto" }, outputs: { formularioEmitter: "formularioEmitter" }, ngContentSelectors: _c1, decls: 1, vars: 1, consts: [[4, "ngIf"], [1, "example-form", 3, "formGroup"], [1, "row"], [1, "col-sm-12", "text-center", "marginbottom1rem"], [1, "form-group"], ["matInput", "", "placeholder", "Televisor 30 pulgadas", "formControlName", "nombre", "type", "text", "aria-describedby", "emailHelp", 1, "form-control", "example-full-width", 3, "ngClass"], [1, "col-sm-6", "text-center", "marginbottom1rem"], ["matInput", "", "placeholder", "B-01", "formControlName", "codigo", "type", "text", "aria-describedby", "emailHelp", 1, "form-control", "example-full-width", 3, "ngClass"], ["matInput", "", "placeholder", "B-01", "formControlName", "codigoAuxiliar", "type", "text", "aria-describedby", "emailHelp", 1, "form-control", "example-full-width", 3, "ngClass"], ["matInput", "", "placeholder", "Televisor sony", "formControlName", "descripcion", "type", "text", "aria-describedby", "emailHelp", 1, "form-control", "example-full-width", 3, "ngClass"], [4, "ngFor", "ngForOf"]], template: function FormularioProductoComponent_Template(rf, ctx) { if (rf & 1) {
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵprojectionDef"]();
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵtemplate"](0, FormularioProductoComponent_div_0_Template, 40, 21, "div", 0);
    } if (rf & 2) {
        _angular_core__WEBPACK_IMPORTED_MODULE_0__["ɵɵproperty"]("ngIf", ctx.formularioProducto);
    } }, directives: [_angular_common__WEBPACK_IMPORTED_MODULE_4__["NgIf"], _angular_forms__WEBPACK_IMPORTED_MODULE_1__["ɵangular_packages_forms_forms_y"], _angular_forms__WEBPACK_IMPORTED_MODULE_1__["NgControlStatusGroup"], _angular_forms__WEBPACK_IMPORTED_MODULE_1__["FormGroupDirective"], _angular_material_form_field__WEBPACK_IMPORTED_MODULE_5__["MatFormField"], _angular_material_form_field__WEBPACK_IMPORTED_MODULE_5__["MatLabel"], _angular_material_input__WEBPACK_IMPORTED_MODULE_6__["MatInput"], _angular_forms__WEBPACK_IMPORTED_MODULE_1__["DefaultValueAccessor"], _angular_forms__WEBPACK_IMPORTED_MODULE_1__["NgControlStatus"], _angular_forms__WEBPACK_IMPORTED_MODULE_1__["FormControlName"], _angular_common__WEBPACK_IMPORTED_MODULE_4__["NgClass"], _angular_material_form_field__WEBPACK_IMPORTED_MODULE_5__["MatHint"], _angular_common__WEBPACK_IMPORTED_MODULE_4__["NgForOf"], _angular_material_form_field__WEBPACK_IMPORTED_MODULE_5__["MatError"]], styles: ["\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJmb3JtdWxhcmlvLXByb2R1Y3RvLmNvbXBvbmVudC5zY3NzIn0= */"] });


/***/ })

}]);
//# sourceMappingURL=modulos-producto-producto-module.js.map