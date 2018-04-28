package chart;

import java.awt.BasicStroke;

import java.awt.Color;

import java.awt.Font;

import java.awt.GradientPaint;

import java.awt.Paint;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.jfree.chart.ChartFrame;

import org.jfree.chart.JFreeChart;

import org.jfree.chart.axis.CategoryAxis;

import org.jfree.chart.axis.CategoryLabelPositions;

import org.jfree.chart.axis.NumberAxis;

import org.jfree.chart.labels.CategoryItemLabelGenerator;

import org.jfree.chart.labels.ItemLabelAnchor;

import org.jfree.chart.labels.ItemLabelPosition;

import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;

import org.jfree.chart.plot.CategoryPlot;

import org.jfree.chart.plot.DatasetRenderingOrder;

import org.jfree.chart.plot.PlotOrientation;

import org.jfree.chart.renderer.category.BarRenderer;

import org.jfree.chart.renderer.category.CategoryItemRenderer;

import org.jfree.chart.renderer.category.LineAndShapeRenderer;

import org.jfree.chart.renderer.category.StandardBarPainter;

import org.jfree.chart.title.TextTitle;

import org.jfree.data.category.DefaultCategoryDataset;

import org.jfree.ui.GradientPaintTransformType;

import org.jfree.ui.HorizontalAlignment;

import org.jfree.ui.StandardGradientPaintTransformer;

import org.jfree.ui.TextAnchor;
import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

 

/**

 * A simple demonstration application showing how to create a bar chart overlaid

 * with a line chart.

 */

public class PolylineBarChart {

 

      

       // Run As > Java Application ���� �����ϸ� �ٷ� Ȯ���� �� ����.

    public void viewChart (Map map) {

       PolylineBarChart demo = new PolylineBarChart();

             JFreeChart chart = demo.getChart(map);

             ChartFrame frame1=new ChartFrame("Bar Chart",chart);

             frame1.setSize(800,400); 

             frame1.setVisible(true);

    }

   

    public JFreeChart getChart(Map map) {
        // ������ ����

        DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();                // bar chart 1

        //DefaultCategoryDataset dataset12 = new DefaultCategoryDataset();         // bar chart 2

        //DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();                // line chart 1

        // ������ �Է� ( ��, ����, ī�װ� )

        // �׷��� 1       
                
        //map���� �����͸� ������ ���� ���� key�� �˾ƾ��Ѵ�.
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
        	String key = (String) iterator.next(); //�����Ѱ� Object�� key�� String���´� �ٽ� String���� �ٲ���Ѵ�.
        	Integer value = (Integer) map.get(key); // value
        	dataset1.addValue(value, "S1", key);
        }
    
        // ������ ���� �� ����

        // ������ ����

        final BarRenderer renderer = new BarRenderer();

        final BarRenderer renderer12 = new BarRenderer();

        final LineAndShapeRenderer renderer2 = new LineAndShapeRenderer();

        // ���� �ɼ� ����

        final CategoryItemLabelGenerator generator = new StandardCategoryItemLabelGenerator();

        final ItemLabelPosition p_center = new ItemLabelPosition(

                ItemLabelAnchor.CENTER, TextAnchor.CENTER

            );

        final ItemLabelPosition p_below = new ItemLabelPosition(

                     ItemLabelAnchor.OUTSIDE6, TextAnchor.TOP_LEFT

                     );

        Font f = new Font("Gulim", Font.BOLD, 14);

        Font axisF = new Font("Gulim", Font.PLAIN, 14);

       

        // ������ ����

        // �׷��� 1

        renderer.setBaseItemLabelGenerator(generator);

        renderer.setBaseItemLabelsVisible(true);

        renderer.setBasePositiveItemLabelPosition(p_center);

        renderer.setBaseItemLabelFont(f);

//        renderer.setGradientPaintTransformer(new StandardGradientPaintTransformer(

//                GradientPaintTransformType.VERTICAL));

//        renderer.setSeriesPaint(0, new GradientPaint(1.0f, 1.0f, Color.white, 0.0f, 0.0f, Color.blue));

        renderer.setSeriesPaint(0, new Color(0,162,255));


        // �׷��� 2       

        renderer12.setSeriesPaint(0, new Color(232,168,255));

        renderer12.setBaseItemLabelFont(f);

        renderer12.setBasePositiveItemLabelPosition(p_center);

        renderer12.setBaseItemLabelGenerator(generator);

        renderer12.setBaseItemLabelsVisible(true);

       

        // �׷��� 3       

        renderer2.setBaseItemLabelGenerator(generator);

        renderer2.setBaseItemLabelsVisible(true);

        renderer2.setBaseShapesVisible(true);

        renderer2.setDrawOutlines(true);

        renderer2.setUseFillPaint(true);

        renderer2.setBaseFillPaint(Color.WHITE);

        renderer2.setBaseItemLabelFont(f);

        renderer2.setBasePositiveItemLabelPosition(p_below);

        renderer2.setSeriesPaint(0,new Color(219,121,22));

        renderer2.setSeriesStroke(0,new BasicStroke(

                                               2.0f,

                                               BasicStroke.CAP_ROUND,

                                               BasicStroke.JOIN_ROUND,

                                               3.0f)

        );

       

        // plot ����

        final CategoryPlot plot = new CategoryPlot();

       

        // plot �� ������ ����

        plot.setDataset(dataset1);

        plot.setRenderer(renderer);

        //plot.setDataset(1,dataset12);

        plot.setRenderer(1,renderer12);

        //plot.setDataset(2, dataset2);

        plot.setRenderer(2, renderer2);

 

        // plot �⺻ ����

        plot.setOrientation(PlotOrientation.VERTICAL);             // �׷��� ǥ�� ����

        plot.setRangeGridlinesVisible(true);                       // X�� ���̵� ���� ǥ�ÿ���

        plot.setDomainGridlinesVisible(true);                      // Y�� ���̵� ���� ǥ�ÿ���

 

        // ������ ���� ���� : dataset ��� ������� ������ ( ��, ���� ����Ѱ� �Ʒ��� �� )

        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);

       

        // X�� ����

        plot.setDomainAxis(new CategoryAxis());              // X�� ���� ����

        plot.getDomainAxis().setTickLabelFont(axisF); // X�� ���ݶ� ��Ʈ ����

        plot.getDomainAxis().setCategoryLabelPositions(CategoryLabelPositions.STANDARD);       // ī�װ� �� ��ġ ����

 

        // Y�� ����

        plot.setRangeAxis(new NumberAxis());                 // Y�� ���� ����

        plot.getRangeAxis().setTickLabelFont(axisF);  // Y�� ���ݶ� ��Ʈ ����

       

        // ���õ� plot�� �������� chart ����

        final JFreeChart chart = new JFreeChart(plot);

//        chart.setTitle("Overlaid Bar Chart"); // ��Ʈ Ÿ��Ʋ

//        TextTitle copyright = new TextTitle("JFreeChart WaferMapPlot", new Font("SansSerif", Font.PLAIN, 9));

//        copyright.setHorizontalAlignment(HorizontalAlignment.RIGHT);

//        chart.addSubtitle(copyright);  // ��Ʈ ���� Ÿ��Ʋ

        return chart;

    }

 

}