package Practice;

class DiffTwoArrTest{
	public static void main(String[] args) {
		int a1[]={1,2,3};
		int a2[]={2,4,6};
		int o1[]=new int[3];
		int o2[]=new int[3];
		int i,j,k=0,l=0,count1,count2;

		for(i=0;i<3;++i){
			count1=0;
			count2=0;
			for(j=0;j<3;++j){
				if(a1[i]==a2[j]){  //comparing elements in a1 not in a2
					count1++;
				}
				if(a2[i]==a1[j]){  //comparing elements in a2 not in a1
					count2++;
				}
			}
			if(count1==0){
				o1[k]=a1[i];      //updating in first output array
				++k;
			}
			if(count2==0){
				o2[l]=a2[i];	  //updating in second output array
				++l;
			}
		}

		System.out.print("1st Output array: ");
		for(i=0;i<3;++i){
			if(o1[i]==0){
				continue;
			}
			System.out.print(o1[i]+" ");
		}

		System.out.print("\n2nd Output array: ");
		for(i=0;i<3;++i){
			if(o2[i]==0){
				continue;
			}
			System.out.print(o2[i]+" ");
		}
		System.out.println();
	}
}