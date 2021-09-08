import Barchart from "components/BarChart";
import Datatable from "components/DataTable";
import DonutsChart from "components/DonutsChart";
import Footer from "components/Footer";
import Navbar from "components/Navbar";

function App() {
  return (
    <>
      <Navbar></Navbar>
      <div className="container">
        <h1 className="text-primary py-3">DashBord Vendas</h1>
        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxa de sucesso(%)</h5>
            <Barchart></Barchart>
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxa de sucesso(%)</h5>
            <DonutsChart/>
          </div>

        </div>

        <div className="py-3">
          <h2 className="text-primary">Todas as Vendas</h2>

        </div>
        <Datatable></Datatable>
      </div>
      <Footer></Footer>
    </>
  );
}

export default App;
