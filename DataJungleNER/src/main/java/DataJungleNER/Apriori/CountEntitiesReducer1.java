package DataJungleNER.Apriori;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class CountEntitiesReducer1 extends Reducer<Text,IntWritable,Text,IntWritable> {
	
	
protected void reduce(Text key, Iterable<IntWritable> values, Context ctx) throws IOException, InterruptedException {	
	
	int count=0;
	for(IntWritable v:values){
		count+=v.get();
	}
	ctx.write(key, new IntWritable(count));
	
	
	
	
}

	
	
	
	
}